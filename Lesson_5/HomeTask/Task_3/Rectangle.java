package Lesson_5.HomeTask.Task_3;

import java.util.Objects;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    protected double getSquare() {
        return sideA * sideB;
    }

    @Override
    protected double getPerimeter() {
        final double CONSTANT = 2;
        double perimeter = CONSTANT * (sideA + sideB);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        /*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.sideA, sideA) == 0 && Double.compare(rectangle.sideB, sideB) == 0;*/

        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Figure))//если объект не является объектом класса Figure
            return false;
        Figure object = (Figure) obj;
        double exp = 0.01;
        return (Math.abs(object.getSquare() - getSquare()) < exp);

    }

    @Override
    public int hashCode() {
        return Objects.hash(getSquare());
    }
}
