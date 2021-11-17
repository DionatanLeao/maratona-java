package academy.devdojo.maratonajava.introduction;

public class Aula006EstruturasRepeticao01 {
    public static void main(String[] args) {

        //while, do while, for
        int cont = 0;

        while(cont < 10) {
            System.out.println(cont++);
            System.out.println(++cont);
        }

        cont = 0;

        do {
            System.out.println("Dentro do do-while " + ++cont);
        } while (cont < 10);

        for (cont = 0; cont < 10; cont++) {
            System.out.println("For " + cont);
        }
    }
}
