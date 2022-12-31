package academy.devdojo.maratonajava.javacore.ZZClambda.test;

import academy.devdojo.maratonajava.javacore.ZZClambda.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One piece", 900),
                new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

    }
}
