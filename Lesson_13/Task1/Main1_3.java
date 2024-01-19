package Lesson_13.Task1;

import Lesson_13.Task1.exceptions.CreateFactorialException;
import Lesson_13.Task1.exceptions.NegativeFactorialValueException;
import Lesson_13.Task1.model.MyMath;

public class Main1_3 {
    public static void main(String[] args) {
        MyMath.Factorial factorial1 = new MyMath.Factorial();

        System.out.println(factorial1);

        try {
            factorial1.setValue(5);
            System.out.println(factorial1);
            factorial1.setValue(-5);
            System.out.println(factorial1);
        } catch (NegativeFactorialValueException exception) {
            System.out.println(exception);
        }

        MyMath.Factorial factorial2 = null;
        MyMath.Factorial factorial3 = null;

        try {
            factorial2 = new MyMath.Factorial(4);
            System.out.println(factorial2);
            factorial3 = new MyMath.Factorial(-4);
            System.out.println(factorial3);

        } catch (CreateFactorialException exception) {
            System.out.println(exception);
        }
        System.out.println("!" + factorial3);
    }
}
