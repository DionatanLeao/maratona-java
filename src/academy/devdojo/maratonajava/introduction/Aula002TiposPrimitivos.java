package academy.devdojo.maratonajava.introduction;

import java.util.Arrays;
import java.util.List;

public class Aula002TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Goku";

        System.out.println("A idade é " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println("char: " + caractere);
        System.out.println("Oi meu nome é " + nome);
    }
}
