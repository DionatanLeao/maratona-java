package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import academy.devdojo.maratonajava.javacore.Oexception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuário");
        String usernameSC = sc.nextLine();
        System.out.println("Senha");
        String senhaSC = sc.nextLine();
        if (!usernameDB.equals(usernameSC) || !senhaDB.equals(senhaSC)) {
            throw  new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso");
    }
}
