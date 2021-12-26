package academy.devdojo.maratonajava.javacore.Oexception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {

    public void Salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando funcionário");
    }
}
