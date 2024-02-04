package Lesson_23._05_methodreference;

import java.util.function.DoubleToLongFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> function = str -> Integer.parseInt(str);
        System.out.println(function.apply("125"));

        Function<String, Integer> function1 = Integer::parseInt;
        System.out.println(function.apply("127"));

        Integer integer = 5;
        Supplier<String> supplier = () -> integer.toString();
        System.out.println(supplier.get());

        Supplier<String> supplier1 = integer::toString;
        System.out.println(supplier.get());

        Function<String, String> funct = str -> str.toUpperCase();
        System.out.println(funct.apply("one"));

        Function<String, String> funct1 = String::toUpperCase;
        System.out.println(funct.apply("two"));

//        Function<String, Integer> f1 = str -> new Integer(str);
//        System.out.println(f1.apply("125"));
    }
}
