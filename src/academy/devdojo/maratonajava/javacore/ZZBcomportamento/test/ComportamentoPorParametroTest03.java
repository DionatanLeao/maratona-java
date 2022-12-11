package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ComportamentoPorParametroTest03 {

    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );

    private static List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

    public static void main(String[] args) {
        System.out.println(filter(cars, car -> car.getColor().equals("black")));
        System.out.println(filter(cars, car -> car.getYear() < 2015));
        System.out.println(filter(numbers, number -> number % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        return list.stream().filter(x -> predicate.test(x)).collect(Collectors.toList());
    }
}
