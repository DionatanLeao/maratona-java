package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        lightNovels.stream().forEach(x -> System.out.println(x));
        lightNovels.stream().forEach(System.out::println);
        lightNovels.forEach(System.out::println);
        long count = lightNovels.stream()
                .filter(x -> x.getPrice() <= 4)
                .count();
        System.out.println(count);
        long count2 = lightNovels.stream()
                .distinct()
                .filter(x -> x.getPrice() <= 4)
                .count();
        System.out.println(count2);
    }
}