package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pelé");
        Jogador[] jogadores = {j1};
        Time t1 = new Time("Seleção Brasileira", jogadores);

        j1.setTime(t1);

        j1.imprime();
        System.out.println();
        System.out.println("------------------------------");
        System.out.println();
        t1.imprime();
    }
}
