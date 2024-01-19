package Lesson_15.OOPTask.model.figures;

import Lesson_15.OOPTask.exception.NonExistentFigureException;
import Lesson_15.OOPTask.model.color.Color;
import Lesson_15.OOPTask.model.interfaces.FigureCalculatable;
import Lesson_15.OOPTask.model.material.Material;

public class Triangle extends Figure implements FigureCalculatable, Comparable<Figure> {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(Material material, double a, double b, double c) {
        super(material);
        if (isValidTriangle(a, b, c)) {
            this.sideA = a;
            this.sideB = b;
            this.sideC = c;
        } else {
            try {
                throw new NonExistentFigureException("You cannot create a triangle with sides: " +
                        "sideA= " + a + " sideB= " + b + " sideC= " + c);
            } catch (NonExistentFigureException e) {
                e.printStackTrace();
            }
        }
    }

    public Triangle(Material material, Color color, double a, double b, double c) {
        super(material, color);
        if (isValidTriangle(a, b, c)) {
            this.sideA = a;
            this.sideB = b;
            this.sideC = c;
        } else {
            try {
                throw new NonExistentFigureException("You cannot create a triangle with sides: " +
                        "sideA= " + a + " sideB= " + b + " sideC= " + c);
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

    public double getSideC() {
        return sideC;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        boolean v = false;
        if ((a + b) > c && (a + c) > b && (b + c) > a && a > 0 && b > 0 && c > 0) v = true;
        return v;
    }

    @Override
    public double getPerimeter() {
        double res = sideA + sideB + sideC;
        return res;
    }

    @Override
    public double getSquare() {
        double square = (getPerimeter() - sideA) * (getSemiPerimeter() - sideB);
        return square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.sideA, sideA) != 0) return false;
        if (Double.compare(triangle.sideB, sideB) != 0) return false;
        return Double.compare(triangle.sideC, sideC) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String fieldsToFileLine() {
        String line = getClass().getSimpleName() + " " + getMaterial().name() + " " + sideA + " " + sideB + " " + sideC;
        return line;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "material=" + getMaterial() +
                ", color=" + getColor() +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", square=" + getSquare() +
                '}';
    }
}
