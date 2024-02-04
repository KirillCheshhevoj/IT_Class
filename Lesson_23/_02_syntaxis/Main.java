package Lesson_23._02_syntaxis;


public class Main {
    public static void main(String[] args) {
        // () -> {}
        // () -> 25;
        NoParameterInt lam1_1 = () -> 25;
//        int int1 = lam1_1.doSmth();
//        int int2  = getInt();
        OneParameterInt lam1_2 = (String value) -> value + "!";
        TwoParametersInt lam1_3 = (int v1, int v2) -> v1 + v2;
        VoidInt lam1_4 = (String val) -> System.out.println(val);
        // bracket only no parameters or more than one
        NoParameterInt lam2_1 = () -> 25;
        OneParameterInt lam2_2 = value2_2 -> value2_2 + "!";
        TwoParametersInt lam2_3 = (int v2_31, int v2_32) -> v2_31 + v2_32;
        VoidInt lam2_4 = va2_4 -> System.out.println(va2_4);

        // type not need
        TwoParametersInt lam3_3 = (v3_31, v3_32) -> v3_31 + v3_32;

        // if only one parameter - type not define
        OneParameterInt lam4_2 = value4_2 -> value4_2 + "!";

        // one string or multiple strings
        NoParameterInt lam5_1 = () -> {
            System.out.println("BUBUBU");
            return 5;
        };

        int result = lam5_1.doSmth();
        System.out.println(result);
    }
}
