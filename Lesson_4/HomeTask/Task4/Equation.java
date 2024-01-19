package Lesson_4.HomeTask.Task4;

public class Equation {
    private int a;
    private int b;
    private int c;
    private static int COEFFICIENT;

    static {
        COEFFICIENT = 0;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Equation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Equation() {
        this(0, 0, 0);
    }

    private double Discriminant() {
        return (Math.pow(b, 2) - (4 * a * c));
    }

    public boolean hasRoots() {
        return Discriminant() >= COEFFICIENT ? true : false;
    }

    public Double rootX1() {
        Double x1 = null;
        if (hasRoots()) {
            if (Discriminant() == COEFFICIENT) {
                x1 = -b / (double) (2 * a);
            } else {
                x1 = ((-b + Math.sqrt(Discriminant())) / (2 * a));
            }
        }
        return x1;
    }

    public Double rootX2() {
        Double x2 = null;
        if (Discriminant() > COEFFICIENT) {
            x2 = ((-b - Math.sqrt(Discriminant())) / (2 * a));
        }
        return x2;
    }
}
