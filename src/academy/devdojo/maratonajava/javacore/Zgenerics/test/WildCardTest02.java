package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);
    }

    private static void printConsulta(List<? extends  Animal> animais) {
        for (Animal animal : animais) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animais) {
        animais.add(new Cachorro());
        animais.add(new Gato());
    }
}
