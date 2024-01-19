package Lesson_8.exam4.model;

public class MyMath {
    // нестатычная поле знешнега класса
    private int res;
    private final static double PI = 3.14;

    public MyMath() {
        // Factorial.x даступны статычныя паля праз імя класса
        // для доступу к нестатычным палям ўкладзенага неабходна
        // прысутнасць аб'екта ўкладзенага
    }

    // аб'екты укладзенага статычнага класса не патрабуюць прысутнасці
    // аб'ектаў знешнега класса
    public static class Factorial {
        // ва укладзеным статычным классе можна створываць
        // статычныя і нестатычныя паля
        // private, static int x;
        private int value;

        // ва укладзеным классе есць доступ толькі к статычным палям
        // знешнега класса
        public Factorial(int value) {
            this.value = value;
        }

        public int getResult() {
            int fact = 1;
            for (int i = 2; i <= value; i++) {
                fact *= i;
            }
            return fact;
        }

        @Override
        public String toString() {
            return "Factorial{" +
                    "value=" + value +
                    ", result=" + getResult() +
                    '}';
        }
    }
}
