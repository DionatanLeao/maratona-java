package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
//        Set<Manga> mangas = new HashSet<>(); //Não permite elementos dupllicados, não mantém a ordem de inserção.
        Set<Manga> mangas = new HashSet<>(); //Não permite elementos dupllicados, matém a ordem de inserção.

        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.90, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
