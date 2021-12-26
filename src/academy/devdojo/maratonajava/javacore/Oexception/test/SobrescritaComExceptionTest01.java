package academy.devdojo.maratonajava.javacore.Oexception.test;

import academy.devdojo.maratonajava.javacore.Oexception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexception.dominio.Pessoa;
import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.Salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
