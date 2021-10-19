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

        // && (AND) || (OR) ! (Logical Not)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroLeiMaiorTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroLeiMenorTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroLeiMaiorTrinta: " + isDentroLeiMaiorTrinta);
        System.out.println("isDentroLeiMenorTrinta: " + isDentroLeiMenorTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlayStationCincoCompravel: " + isPlayStationCincoCompravel);
    }
}
