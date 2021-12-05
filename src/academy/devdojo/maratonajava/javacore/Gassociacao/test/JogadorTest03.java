package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Cafu");
        Jogador j2 = new Jogador("Ronaldo");
        Time t1 = new Time("Brasil");
        Jogador[] jogadores = {j1, j2};

        j1.setTime(t1);
        j2.setTime(t1);

        t1.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        j1.imprime();

        System.out.println("--- Time ---");
        t1.imprime();
    }
}
