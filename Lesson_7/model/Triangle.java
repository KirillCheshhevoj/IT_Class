package Lesson_7.model;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        if (isTriangle(sideA, sideB, sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            this.sideA = 0.0;
            this.sideB = 0.0;
            this.sideC = 0.0;
        }
    }

    private boolean isTriangle(double a, double b, double c) {
        boolean answer = false;
        if (a > 0 && b > 0 && c > 0) {
            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                answer = true;
            }
        }
        return answer;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    protected  double getSquare() {
        double semiPer = getPerimeter() / 2;
        return (Math.sqrt(semiPer * (semiPer - sideA) * (semiPer - sideB) * (semiPer - sideC)));
    }

    @Override
    protected  double getPerimeter() {
        return (sideA + sideB + sideC);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                "} " + super.toString();
    }
}
