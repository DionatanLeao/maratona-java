package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
    }

    private static void printConsulta(List<Animal> animais) {
        for (Animal animal : animais) {
            animal.consulta();
        }

        animais.add(new Cachorro());
    }
}
