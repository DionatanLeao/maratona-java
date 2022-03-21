package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
//        List nomes = new ArrayList(); // 1.4
        List<String> nomes = new ArrayList<>(16); // 1.5
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Dionatan");
        nomes.add("DevDojo");
        nomes2.add("Leão");
        nomes2.add("Academy");
//        nomes.remove(1);
//        System.out.println(nomes.remove("Leão"));

        nomes.addAll(nomes2);

        for (String nome: nomes) {
            System.out.println(nome);
        }

//        nomes.add("Leão");

        System.out.println("---------");

        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);

    }
}
