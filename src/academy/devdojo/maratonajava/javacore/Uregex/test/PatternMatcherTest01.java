package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // \d = Todos os digítos
        // \\D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os espaços em branco
        // \w = a-ZA-Z, dígitos, _
        // \W = Tudo que não for incluso no \w
        // []

        //String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        String texto = "12 0x 0X 0xFFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        int numeroHex = 0XFFFFFF;
        System.out.println(numeroHex);
    }
}
