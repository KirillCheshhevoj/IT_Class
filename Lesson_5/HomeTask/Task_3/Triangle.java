package Lesson_5.HomeTask.Task_3;

import java.util.Objects;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

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

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    private double getSemiPerimeter() {
        double CONSTANT = 2.0;
        return (getPerimeter() / CONSTANT);
    }

    @Override
    protected double getSquare() {
        double value = (getSemiPerimeter() - sideA) * (getSemiPerimeter() - sideB) * (getSemiPerimeter() - sideC);
        double square = Math.sqrt(getSemiPerimeter() * value);//формула Герона
        return square;
    }

    @Override
    protected double getPerimeter() {
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Figure))
            return false;
        Figure object = (Figure) obj;
        double exp = 0.01;
        return (Math.abs(object.getSquare() - getSquare()) < exp);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getSquare());
    }
}
