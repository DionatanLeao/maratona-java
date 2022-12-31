package academy.devdojo.maratonajava.javacore.ZZClambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>(List.of("Rimuru", "Veldora", "Hikimaru"));
        names.sort(String::compareTo);
        System.out.println(names);
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(names, "Rimuru"));
    }
}
