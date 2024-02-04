package Lesson_23._03_vars;

public class Main {
    static int x = 10; // пераменныя, якія аб'явілі на узровне класе відны ў лямбдзе і могуць быць ізменяны
    static int y = 20;

    public static void main(String[] args) {
        OperateInt operate = () -> {
            x = 30;
            return x + y;
        };
        System.out.println(operate.operate());
    }
}
