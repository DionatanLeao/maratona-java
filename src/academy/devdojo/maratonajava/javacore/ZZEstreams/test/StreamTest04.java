package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("graphicDesigners 1", "graphicDesigners 2", "graphicDesigners 3");
        List<String> developers = List.of("developers 1", "developers 2", "developers 3");
        List<String> students = List.of("students 1", "students 2", "students 3");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> peaple :  devdojo) {
            for (String person : peaple) {
                System.out.println(person);
            }
        }
        System.out.println("----------------------");
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}