package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ComportamentoPorParametroTest02 {

    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );

    public static void main(String[] args) {
        System.out.println(filter(cars, car -> car.getColor().equals("black")));
        System.out.println(filter(cars, car -> car.getYear() < 2015));
    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate) {
        return cars.stream()
                .filter(x -> carPredicate.test(x)).collect(Collectors.toList());
    }
}
