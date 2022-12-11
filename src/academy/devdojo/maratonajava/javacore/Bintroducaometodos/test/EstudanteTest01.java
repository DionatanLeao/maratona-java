package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        ImpressoraEstudante print = new ImpressoraEstudante();
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Midoriya";
        estudante1.idade = 15;
        estudante1.sexo =  'M';

        estudante2.nome = "Sakura";
        estudante2.idade = 16;
        estudante2.sexo =  'F';

        print.imprime(estudante1);
        print.imprime(estudante2);



    }
}
