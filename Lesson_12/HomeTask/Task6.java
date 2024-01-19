package Lesson_12.HomeTask;

public class Task6 {
    public static void main(String[] args) {
        int[] arr1 = new int[0];
        int[] arr2 = null;
        int[] arr3 = {1, 2, 3, 4, 5};

        System.out.println("Arithmetic mean by array = " + getArithmeticMean(arr1));
        System.out.println("Arithmetic mean by array = " + getArithmeticMean(arr2));
        System.out.println("Arithmetic mean by array = " + getArithmeticMean(arr3));
    }

    static int getArithmeticMean(int[] arr) {
        int x = 0;
        try {
            for (int i : arr) {
                x += i;
            }
            x /= arr.length;
        } catch (NullPointerException | ArithmeticException exception) {
            System.out.println(exception);
        }
        return x;
    }
}
