package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .firstName("firstName")
                .lastName("lastName")
                .username("username")
                .email("email")
                .build();

        System.out.println(person);
    }
}
