package Lesson_13.Task1.model;

import Lesson_13.Task1.exceptions.CreateFactorialException;
import Lesson_13.Task1.exceptions.DivideByZeroException;
import Lesson_13.Task1.exceptions.NegativeFactorialValueException;
import Lesson_13.Task1.exceptions.NullDoubleArrayException;

public class MyMath {

    public static class Factorial {
        private int value = 1;

        public Factorial() {
            value = 1;
        }

        public Factorial(int value) throws  CreateFactorialException {
            try {
                setValue(value);
            } catch (NegativeFactorialValueException exception) {
                // калі пры стварэнні фактарыяла прыйшло адмоўнае значэнне, то
                // генеруецца выключэнне NegativeFactorialValueException, якое адлоўліваем
                // і генеруючы выключэнне CreateFactorialException, прычынай якога стала
                // выключэнне NegativeFactorialValueException
                throw new CreateFactorialException("Ошибка создания факториала", exception);
            }
            this.value = value;
        }

        public void setValue(int value) throws NegativeFactorialValueException{
            if(value < 0) throw  new NegativeFactorialValueException("Negative value", value);
            this.value = value;
        }

        public long getFactorial() {
            long res = 1;
            for (int i = 2; i <= value; i++) {
                res *= i;
            }
            return res;
        }

        @Override
        public String toString() {
            return "Lesson_13.Task1.model.MyMath.Factorial{" +
                    "value=" + value +
                    ", factorial=" + getFactorial() +
                    '}';
        }
    }

    public static double avgDoubleArrayExm1(double[] arr) throws NullPointerException, ArithmeticException {
        double avg = 0.0;

        if (arr == null) throw new NullPointerException();
        if (arr.length == 0) throw new ArithmeticException(" / by zero!");

        for (double v : arr) {
            avg += v;
        }
        return avg;
    }

    public static double avgDoubleArrayExm2(double arr[]) throws NullDoubleArrayException, DivideByZeroException {
        double avg = 0.0;

        if (arr == null) throw new NullDoubleArrayException();
        if (arr.length == 0) throw new DivideByZeroException("!!!");

        for (double v : arr) {
            avg += v;
        }
        return avg;
    }
}
