package Lesson_13.Task1;

import Lesson_13.Task1.exceptions.DivideByZeroException;
import Lesson_13.Task1.exceptions.NullDoubleArrayException;
import Lesson_13.Task1.model.MyMath;

public class Main1 {
    public static void main(String[] args) {
        double[] arr1 = {7.2, 4.8, 9.2};
        double[] arr2 = {};
        double[] arr3 = null;
        try {
            System.out.println(MyMath.avgDoubleArrayExm1(arr1));
        } catch (NullPointerException exception) {
            System.out.println("arr1 is null.");
        } catch (ArithmeticException exception) {
            System.out.println("arr1 is empty.");
        }

        try {
            System.out.println(MyMath.avgDoubleArrayExm1(arr2));
        } catch (NullPointerException exception) {
            System.out.println("arr2 is null.");
        } catch (ArithmeticException exception) {
            System.out.println("arr2 is empty.");
        }

        try {
            System.out.println(MyMath.avgDoubleArrayExm1(arr3));
        } catch (NullPointerException exception) {
            System.out.println("arr3 is null.");
        } catch (ArithmeticException exception) {
            System.out.println("arr3 is empty.");
        }

        System.out.println("---------------------------");

        try {
            System.out.println(MyMath.avgDoubleArrayExm2(arr1));
        } catch (NullDoubleArrayException exception) {
            System.out.println("arr1 is null.");
        } catch (DivideByZeroException exception) {
            System.out.println("arr1 is empty.");
        }

        try {
            System.out.println(MyMath.avgDoubleArrayExm2(arr2));
        } catch (NullDoubleArrayException exception) {
            System.out.println("arr2 is null.");
        } catch (DivideByZeroException exception) {
            System.out.println("arr2 is empty.");
        }

        try {
            System.out.println(MyMath.avgDoubleArrayExm2(arr3));
        } catch (NullDoubleArrayException exception) {
            System.out.println("arr3 is null.");
        } catch (DivideByZeroException exception) {
            System.out.println("arr3 is empty.");
        }
    }
}
