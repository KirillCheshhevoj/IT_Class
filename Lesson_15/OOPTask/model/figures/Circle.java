package Lesson_15.OOPTask.model.figures;

import Lesson_15.OOPTask.exception.NonExistentFigureException;
import Lesson_15.OOPTask.model.color.Color;
import Lesson_15.OOPTask.model.interfaces.FigureCalculatable;
import Lesson_15.OOPTask.model.material.Material;

public class Circle extends Figure implements FigureCalculatable, Comparable<Figure> {
    private double radius;

    public Circle(Material material, double r) {
        super(material);
        if (isValidCircle(r)) {
            radius = r;
        } else {
            try {
                throw new NonExistentFigureException("You cannot create a circle with radius: " +
                        "radius= " + r);
            } catch (NonExistentFigureException e) {
                e.printStackTrace();
            }
        }
    }

    public Circle(Material material, Color color, double r) {
        super(material, color);
        if (isValidCircle(r)) {
            radius = r;
        } else {
            try {
                throw new NonExistentFigureException("You cannot create a circle with radius: " +
                        "radius= " + r);
            } catch (NonExistentFigureException e) {
                e.printStackTrace();
            }
        }
    }

    public double getRadius() {
        return radius;
    }

    private boolean isValidCircle(double r) {
        boolean v = false;
        if (r > 0) v = true;
        return v;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public double getSquare() {
        double square = Math.PI * Math.pow(radius, 2.0);
        return square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    public String fieldsToFileLine(){
        String line = getClass().getSimpleName() + " " + getMaterial().name() + " " + radius;
        return line;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "material=" + getMaterial() +
                ", color=" + getColor() +
                ", radius=" + radius +
                ", square=" + getSquare() +
                '}';
    }

}