package Lesson_7;

import Lesson_7.model.*;

public class Main {
    public static void main(String[] args) {
        FigureList figureList = new FigureList();
        figureList.add(new Circle(5));
        figureList.add(new Rectangle(4, 6));
        figureList.add(new Triangle(3, 4, 5));
        figureList.add(new Circle(2));
        figureList.add(new Rectangle(2, 12));

        figureList.showFigures();

        //создали отдельный массив
        Figure[] figures1 = new Figure[]{
                new Triangle(3, 6, 4),
                new Circle(6)};

        //добавляем в список сразу весь массив
        figureList.addFigures(figures1);
        figureList.showFigures();
        figureList.showFigureByIndex(2);
        figureList.delFigureByIndex(2);
        figureList.showFigureByIndex(2);

        System.out.println("General Square: " + figureList.getGeneralSquare());

        Circle[] circles = figureList.getCircles();
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        }

        System.out.println("-----------------------------");
        System.out.println("The figure with the smallest area->  " + figureList.minSquare());
        System.out.println("The shape with the smallest perimeter->  " + figureList.minPerimeter());

        Figure figure = new Rectangle(4, 6);
        figures1 = figureList.getFigureEqualTo(figure);
        for (Figure figure1 : figures1) {
            System.out.println(figure1);
        }
    }
}
