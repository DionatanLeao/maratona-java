package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.List;
import java.util.stream.Collectors;

public class ComportamentoPorParametroTest01 {

    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );

    public static void main(String[] args) {
        List<Car> filterGreen = filterCarByColor(cars, "green");
        List<Car> filterAge = filterByYearBefore(ComportamentoPorParametroTest01.cars, 2015);
        System.out.println(filterGreen);
        System.out.println(filterAge);
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        return cars.stream()
                .filter(x -> x.getColor().equals(color)).collect(Collectors.toList());
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        return cars.stream()
                .filter(x -> x.getYear() < year).collect(Collectors.toList());
    }
}
