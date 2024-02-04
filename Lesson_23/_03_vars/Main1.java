package Lesson_23._03_vars;

public class Main1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        OperateInt operate = () -> {
            // x = 30;
            return x + y;
        };
        // y = 56; аб'яўленныя ўнутры класа відны ў лямбдзе, але ня могуць быць зменяны
        int result = operate.operate();
        System.out.println(operate.operate());
    }
}
