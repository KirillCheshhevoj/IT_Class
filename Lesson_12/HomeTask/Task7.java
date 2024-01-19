package Lesson_12.HomeTask;

public class Task7 {
    public static void main(String[] args) {
        int[] arr1 = new int[0];
        int[] arr2 = null;
        int[] arr3 = {1, 2, 3, 4, 5};

        try {
            System.out.println("Arithmetic mean by array = " + getArithmeticMean(arr1));
        } catch (NullPointerException | ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.println("Arithmetic mean by array = " + getArithmeticMean(arr2));
        } catch (NullPointerException | ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.println("Arithmetic mean by array = " + getArithmeticMean(arr3));
        } catch (NullPointerException | ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static int getArithmeticMean(int[] arr) throws NullPointerException, ArithmeticException {
        int x = 0;
        for (int i : arr) {
            x += i;
        }
        return (x /= arr.length);

    }
}
