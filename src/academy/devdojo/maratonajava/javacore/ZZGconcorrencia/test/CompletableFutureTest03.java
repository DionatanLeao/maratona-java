package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPriceSyncCompletableFuture(storeServiceDeprecated);
    }

    private static void searchPriceSyncCompletableFuture(StoreServiceDeprecated storeServiceDeprecated) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        ExecutorService executorService = Executors.newFixedThreadPool(10, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });

        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeServiceDeprecated.getPriceSync(s), executorService))
                .collect(Collectors.toList());

        List<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println(prices);
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSyncFuture %dms%n", (end - start));
    }
}
