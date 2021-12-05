package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor p1 = new Professor("Romildo");
        Professor p2 = new Professor("Rogildo");
        Professor p3 = new Professor("Roberval");
        Professor[] professores = {p1,p2,p3};
        Escola escola = new Escola("Instituto Alfa", professores);

        escola.imprime();
    }
}
