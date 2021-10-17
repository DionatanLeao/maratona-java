package academy.devdojo.maratonajava.introduction;

public class Aula004Operadores {
    public static void main(String[] args) {
        //+-/*
        int numero01 = 10;
        int numero02 = 20;

        int soma = numero01 + numero02;
        int subtracao = numero01 - numero02;
        int multiplicacao = numero01 * numero02;
        double divisao = numero01 / numero02;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        // %
        int resto = 21 % 7;
        System.out.println("Resto Divisão: " + resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        System.out.println("isDezIgualDez: " + isDezIgualDez);
        System.out.println("isDezDiferenteDez: " + isDezDiferenteDez);
    }
}
