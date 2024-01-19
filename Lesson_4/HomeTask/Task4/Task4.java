package Lesson_4.HomeTask.Task4;

public class Task4 {
    public static void main(String[] args) {
        Equation eq1 = new Equation(4, 22, 2);
        System.out.println("Roots: " + eq1.hasRoots());
        System.out.printf("x1 = %.2f", eq1.rootX1());
        System.out.printf("x2 = %.2f", eq1.rootX2());

        Equation eq2 = new Equation(0, 0, 0);
        System.out.println("Roots: " + eq2.hasRoots());
        System.out.printf("x1 = %.2f", eq2.rootX1());
        System.out.printf("x2 = %.2f", eq2.rootX2());
    }
}
