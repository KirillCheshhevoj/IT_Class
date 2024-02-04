package Lesson_23._04_predefined;

import java.net.UnixDomainSocketAddress;
import java.util.function.*;

public class Main {
    static Predicate<Integer> negativeNumbers = i -> i < 0;

    public static void main(String[] args) {
        // T -> boolean

        System.out.println(negativeNumbers.test(-25));
        Predicate<String> shortString = i -> i.length() < 5;
        System.out.println(shortString.test("blablabla"));

        Predicate<String> containsA = i -> i.contains("A");
        System.out.println(containsA.and(shortString).test("qAzw"));
        System.out.println(containsA.and(shortString).test("qAzwsxasdasd"));
        System.out.println(containsA.or(shortString).test("qAzwasda"));
        System.out.println(containsA.or(shortString).test("qAzw"));

        // T -> void
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        Consumer<String> printLowerCase = str -> System.out.println(str.toLowerCase());
        printUpperCase.andThen(printLowerCase).accept("blaBLaBLa");

        // T -> R;
        Function<Double, Long> doubleToLong = Math::round;
        System.out.println(doubleToLong.apply(15.75));

        // () -> T
        String str = "one";
        Supplier<String> supplier = str::toUpperCase;
        System.out.println(supplier.get());

        // T -> T
        UnaryOperator<String> unaryOperator = str1 -> str1.toUpperCase();
        System.out.println(unaryOperator.apply("two"));

    }
}
