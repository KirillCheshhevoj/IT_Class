package Lesson_7.model;

import java.util.Arrays;

public class FigureList {
    private static final int INITIAIL_SIZE = 4;
    private Figure[] figures = new Figure[INITIAIL_SIZE];
    private int currentSize = 0;

    // чакаем спасылку на якую-небудзь фігуру
    public void add(Figure figure) {
        if (figure != null) {
            if (currentSize == figures.length) {
                figures = Arrays.copyOf(figures, figures.length * 3 / 2 + 1);
            }
            figures[currentSize++] = figure;
        }
    }

    // чакаем колькасць фігур або масіў
    public void addFigures(Figure... figs) {
        for (Figure fig : figs) {
            add(fig);
        }
    }

    public void showFigures() {
        System.out.println("size = " + currentSize);
        System.out.println("capacity = " + figures.length);
        for (int i = 0; i < currentSize; i++) {
            System.out.println(figures[i]);
        }
    }

    public void showFigureByIndex(int index) {
        if (isValidIndex(index)) {
            System.out.println(figures[index]);
        }
    }

    public void delFigureByIndex(int index) {
        if (isValidIndex(index)) {
            System.arraycopy(figures, index + 1, figures, index, currentSize - index - 1);
            currentSize--;
        }
    }

    private boolean isValidIndex(int index) {
        return (index >= 0 && index < currentSize);
    }

    public double getGeneralSquare() {
        double result = 0.0;
        for (int i = 0; i < currentSize; i++) {
            result += figures[i].getSquare();
        }
        return result;
    }

    public Figure minSquare() {
        Figure figure = null;
        double minSquare = figures[0].getSquare();
        for (int i = 1; i < currentSize; i++) {
            if (figures[i].getSquare() <= minSquare) {
                minSquare = figures[i].getSquare();
                figure = figures[i];
            }
        }
        return figure;
    }

    public Figure minPerimeter() {
        Figure figure = null;
        double minPerimeter = figures[0].getPerimeter();
        for (int i = 1; i < currentSize; i++) {
            if (figures[i].getPerimeter() <= minPerimeter) {
                minPerimeter = figures[i].getPerimeter();
                figure = figures[i];
            }
        }
        return figure;
    }

    public Circle[] getCircles() {
        Circle[] circles = null;
        int index = -1;
        int counter = 0;
        for (int i = 0; i < currentSize; i++) {
            if (figures[i] instanceof Circle) {
                counter++;
            }
        }


        circles = new Circle[counter];
        for (int i = 0; i < currentSize; i++) {
            if (figures[i] instanceof Circle) {
                circles[++index] = (Circle) figures[i];
            }
        }
        return circles;
    }

    public Triangle[] getTriangles() {
        Triangle[] triangles = null;
        int index = -1;
        int counter = 0;

        for (int i = 0; i < currentSize; i++) {
            if (figures[i] instanceof Triangle) {
                counter++;
            }
        }


        triangles = new Triangle[counter];
        for (int i = 0; i < currentSize; i++) {
            if (figures[i] instanceof Triangle) {
                triangles[++index] = (Triangle) figures[i];
            }
        }
        return triangles;
    }

    public Rectangle[] getRectangles() {
        Rectangle[] rectangles = null;
        int index = -1;
        int counter = 0;

        for (int i = 0; i < currentSize; i++) {
            if (figures[i] instanceof Rectangle) {
                counter++;
            }
        }

        rectangles = new Rectangle[counter];
        for (int i = 0; i < currentSize; i++) {
            if (figures[i] instanceof Rectangle) {
                rectangles[++index] = (Rectangle) figures[i];
            }
        }
        return rectangles;
    }

    public Figure[] getFigureEqualTo(Figure figure) {
        Figure[] figs = null;
        int index = -1;
        int counter = 0;
        for (int i = 0; i < currentSize; i++) {
            if (figures[i].equals(figure)) {
                counter++;
            }
        }

        figs = new Figure[counter];
        for (int i = 0; i < currentSize; i++) {
            if (figures[i].equals(figure)) {
                figs[++index] = figures[i];
            }
        }
        return figs;
    }
}
