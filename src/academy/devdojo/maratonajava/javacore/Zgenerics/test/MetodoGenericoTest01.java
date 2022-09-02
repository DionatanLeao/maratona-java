package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
//        new DoisAtributos<Cachorro, Gato, Carro>();
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);

    }
}

//class DoisAtributos<T, X, I> {
//
//    private T t;
//    private X x;
//    private I i;
//
//    public DoisAtributos(T t, X x, I i) {
//        this.t = t;
//        this.x = x;
//        this.i = i;
//    }
//}
