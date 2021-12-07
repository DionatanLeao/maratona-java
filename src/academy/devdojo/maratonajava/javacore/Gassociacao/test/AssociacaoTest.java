package academy.devdojo.maratonajava.javacore.Gassociacao.test;


import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunos = {aluno};
        Seminario seminario = new Seminario("Onde achar one piece", alunos, local);
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);
        professor.imprime();
    }
}
