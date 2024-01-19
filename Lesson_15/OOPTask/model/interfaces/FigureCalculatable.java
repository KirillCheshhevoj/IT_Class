package Lesson_15.OOPTask.model.interfaces;

public interface FigureCalculatable {
    default double getPerimeter() {
        return 0;
    }

    default double getSquare() {
        return 0;
    }

    default double getSemiPerimeter() {
        return (getPerimeter() / 2);
    }
}
