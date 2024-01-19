package Lesson_5.HomeTask.Task_3;

import java.util.Objects;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    protected double getSquare() {
        double square = Math.PI * (radius * radius);
        return square;
    }

    @Override
    protected double getPerimeter() {
        final double CONSTANT = 2;
        double perimeter = CONSTANT * Math.PI * radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        /*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;*/

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
        return Objects.hashCode(getSquare());
    }
}
