package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.domain.Quote;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceDeprecated;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount storeService = new StoreServiceWithDiscount();
        searchPricesWithDiscount(storeService);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount storeService) {
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
//        stores.forEach(s -> System.out.println(storeService.getPriceSync(s)));
        stores.stream()
                .map(storeService::getPriceSync)
                .map(Quote::newQuote)
                .map(storeService::applyDiscount)
                .forEach(System.out::println);
    }
}
