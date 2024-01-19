package Lesson_7.model;

public abstract class Figure {
    protected abstract double getSquare();

    protected abstract double getPerimeter();

    public static double getTotalSquare(Figure[] figures) {
        double sum = 0.0;
        for (int i = 0; i < figures.length; i++) {
            sum += figures[i].getSquare();
        }
        return sum;
    }

    public static double getMinPerimeter(Figure[] figures) {
        double minPerimeter = figures[0].getPerimeter();

        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getPerimeter() <= minPerimeter) {
                minPerimeter = figures[i].getPerimeter();
            }
        }
        return minPerimeter;
    }

    public static double getMaxPerimeter(Figure[] figures) {
        double maxPerimeter = figures[0].getPerimeter();

        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getPerimeter() >= maxPerimeter) {
                maxPerimeter = figures[i].getPerimeter();
            }
        }
        return maxPerimeter;
    }

    public static Figure[] getFigureMinPerimeter(Figure[] figures) {
        int sizeArray = 0, index = -1;
        double minPerimeter = getMinPerimeter(figures);
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getPerimeter() == minPerimeter) {
                sizeArray++;
            }
        }
        Figure[] array = new Figure[sizeArray];

        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getPerimeter() == minPerimeter) {
                index++;
                array[index] = figures[i];
            }
        }
        return array;
    }

    public static Figure[] getFigureMaxPerimeter(Figure[] figures) {
        int sizeArray = 0, index = -1;
        double maxPerimeter = getMaxPerimeter(figures);
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getPerimeter() == maxPerimeter) {
                sizeArray++;
            }
        }
        Figure[] array = new Figure[sizeArray];

        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getPerimeter() == maxPerimeter) {
                index++;
                array[index] = figures[i];
            }
        }
        return array;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Figure))
            return false;

        Figure figure = (Figure) obj;
        final double EPS = 0.01;
        return (Math.abs(getSquare() - figure.getSquare()) < EPS);
    }
}
