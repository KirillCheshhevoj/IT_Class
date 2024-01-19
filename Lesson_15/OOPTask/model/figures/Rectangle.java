package Lesson_15.OOPTask.model.figures;

import Lesson_15.OOPTask.exception.NonExistentFigureException;
import Lesson_15.OOPTask.model.color.Color;
import Lesson_15.OOPTask.model.interfaces.FigureCalculatable;
import Lesson_15.OOPTask.model.material.Material;

public class Rectangle extends Figure implements FigureCalculatable, Comparable<Figure> {
    private double sideA;
    private double sideB;

    public Rectangle(Material material, double a, double b) {
        super(material);
        if (isValidRectangle(a, b)) {
            this.sideA = a;
            this.sideB = b;
        } else {
            try {
                throw new NonExistentFigureException("You cannot create a rectangle with sides: " +
                        "sideA= " + a + " sideB= " + b);
            } catch (NonExistentFigureException e) {
                e.printStackTrace();
            }
        }
    }

    public Rectangle(Material material, Color color, double a, double b) {
        super(material, color);
        if (isValidRectangle(a, b)) {
            this.sideA = a;
            this.sideB = b;
        } else {
            try {
                throw new NonExistentFigureException("You cannot create a rectangle with sides: " +
                        "sideA= " + a + " sideB= " + b);
            } catch (NonExistentFigureException e) {
                e.printStackTrace();
            }
        }
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    private boolean isValidRectangle(double a, double b) {
        boolean v = false;
        if (a > 0 && b > 0) v = true;
        return v;
    }

    @Override
    public double getPerimeter() {
        double perimeter = (sideA + sideB) * 2;
        return perimeter;
    }

    @Override
    public double getSquare() {
        double square = sideA * sideB;
        return square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.sideA, sideA) != 0) return false;
        return Double.compare(rectangle.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String fieldsToFileLine() {
        String line = getClass().getSimpleName() + " " + getMaterial().name() + " " + sideA + " " + sideB;
        return line;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "material=" + getMaterial() +
                ", color=" + getColor() +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", square=" + getSquare() +
                '}';
    }
}