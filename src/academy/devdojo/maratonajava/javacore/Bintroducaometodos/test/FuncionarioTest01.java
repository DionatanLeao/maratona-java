package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1000, 2000, 3000});
        funcionario.imprimeDados();
        System.out.println("Média: " + funcionario.getMedia());
    }
}
