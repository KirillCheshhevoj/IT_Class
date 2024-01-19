package Lesson_15.OOPTask.model.person;

import Lesson_15.OOPTask.exception.*;
import Lesson_15.OOPTask.model.color.Color;
import Lesson_15.OOPTask.model.figures.*;
import Lesson_15.OOPTask.model.material.Material;


import java.io.*;
import java.util.Arrays;

public class Person {
    private final static Material PAPER = Material.PAPER;
    private final static Material TAPE = Material.TAPE;
    private Box figureBox = new Box();
    private String name;
    private Figure figure;


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }

    public Box getFigureBox() {
        return figureBox;
    }

    private void setFigure(Figure figure) {
        this.figure = figure;
    }

    private boolean isValidCut(Figure obj) throws NonExistentFigureException, InsufficientMaterialException {
        if (figure == null)
            throw new NonExistentFigureException("The shape for cropping was not found");
        if (Double.compare(figure.getSquare(), obj.getSquare()) > 0) {
            return true;
        } else throw new InsufficientMaterialException("Insufficient size of the original shape");
    }

    private boolean isValidCut(Figure srcObj, Figure destObj) throws NonExistentFigureException,
            InsufficientMaterialException {
        if (destObj == null)
            throw new NonExistentFigureException("The shape for cropping was not found");
        if (Double.compare(srcObj.getSquare(), destObj.getSquare()) > 0) {
            return true;
        } else throw new InsufficientMaterialException("Insufficient size of the original shape");
    }

    public void cutNewTriangle(Material material, double a, double b, double c) {
        Triangle triangle = null;
        switch (material) {
            case PAPER -> triangle = new Triangle(PAPER, a, b, c);
            case TAPE -> triangle = new Triangle(TAPE, a, b, c);
        }
        figure = triangle;
    }

    public void cutNewRectangle(Material material, double a, double b) {
        Rectangle rectangle = null;
        switch (material) {
            case PAPER -> rectangle = new Rectangle(PAPER, a, b);
            case TAPE -> rectangle = new Rectangle(TAPE, a, b);
        }
        figure = rectangle;
    }

    public void cutNewCircle(Material material, double r) {
        Circle circle = null;
        switch (material) {
            case PAPER -> circle = new Circle(PAPER, r);
            case TAPE -> circle = new Circle(TAPE, r);
        }
        figure = circle;
    }

    public void cutTriangleFromFigure(double a, double b, double c) {
        try {
            Triangle triangle = new Triangle(getFigure().getMaterial(), getFigure().getColor(), a, b, c);
            if (isValidCut(triangle)) figure = triangle;
        } catch (NonExistentFigureException | InsufficientMaterialException e) {
            e.printStackTrace();
        }
    }

    public void cutTriangleFromFigure(int index, double a, double b, double c) {
        Figure figure = getFigureBox().getByIndex(index);
        Triangle triangle = new Triangle(figure.getMaterial(), figure.getColor(), a, b, c);
        try {

            if (isValidCut(figure, triangle)) getFigureBox().addByIndex(triangle, index);
        } catch (NonExistentFigureException | InsufficientMaterialException e) {
            e.printStackTrace();
        }
    }

    public void cutRectangleFromFigure(double a, double b) {
        try {
            Rectangle rectangle = new Rectangle(getFigure().getMaterial(), getFigure().getColor(), a, b);
            if (isValidCut(rectangle)) figure = rectangle;
        } catch (NonExistentFigureException | InsufficientMaterialException e) {
            e.printStackTrace();
        }
    }

    public void cutRectangleFromFigure(int index, double a, double b) {
        Figure figure = getFigureBox().getByIndex(index);
        Rectangle rectangle = new Rectangle(figure.getMaterial(), figure.getColor(), a, b);
        try {
            if (isValidCut(figure, rectangle)) getFigureBox().addByIndex(rectangle, index);
        } catch (NonExistentFigureException | InsufficientMaterialException e) {
            e.printStackTrace();
        }
    }

    public void cutCircleFromFigure(double r) {
        try {
            Circle circle = new Circle(getFigure().getMaterial(), getFigure().getColor(), r);
            if (isValidCut(circle)) figure = circle;
        } catch (NonExistentFigureException | InsufficientMaterialException e) {
            e.printStackTrace();
        }
    }

    public void cutCircleFromFigure(int index, double r) {
        Figure figure = getFigureBox().getByIndex(index);
        Circle circle = new Circle(figure.getMaterial(), figure.getColor(), r);
        try {
            if (isValidCut(figure, circle)) getFigureBox().addByIndex(circle, index);
        } catch (NonExistentFigureException | InsufficientMaterialException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return figure != null ? figure.equals(person.figure) : person.figure == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (figure != null ? figure.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", figure=" + figure +
                '}';
    }

    public class Box {
        private final int MAX_SIZE = 20;
        private Figure[] figures = new Figure[0];
        private int currentSize = 0;

        public void add(Figure figure) {
            try {
                if (currentSize == MAX_SIZE)
                    throw new BoxItemsFullException("Maximum number of items per box : 20");
                if (figure != null) {
                    figures = Arrays.copyOf(figures, figures.length + 1);
                    figures[currentSize++] = figure;
                }
                if (figure.equals(getFigure())) setFigure(null);//если добавляемая фигура та, что вырезала девочка,
                //то после добавления в коробку, она не должна оставаться у девочки во втором экземпляре
            } catch (BoxItemsFullException e) {
                e.printStackTrace();
            }
        }

        public void addByIndex(Figure f, int index) {
            figures[index] = f;
        }

        public void addFromFile(String fileName) {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String readLine = "";
                while ((readLine = br.readLine()) != null) {
                    String[] fields = readLine.split(" ");
                    switch (fields[0]) {
                        case "Triangle": {
                            if (fields[1].equals(Material.PAPER.name()))
                                add(new Triangle(Material.PAPER, Double.parseDouble(fields[2]), Double.parseDouble(fields[3]), Double.parseDouble(fields[4])));
                            if (fields[1].equals(Material.TAPE.name()))
                                add(new Triangle(Material.TAPE, Double.parseDouble(fields[2]), Double.parseDouble(fields[3]), Double.parseDouble(fields[4])));
                        }
                        break;
                        case "Rectangle": {
                            if (fields[1].equals(Material.PAPER.name()))
                                add(new Rectangle(Material.PAPER, Double.parseDouble(fields[2]), Double.parseDouble(fields[3])));
                            if (fields[1].equals(Material.TAPE.name()))
                                add(new Rectangle(Material.TAPE, Double.parseDouble(fields[2]), Double.parseDouble(fields[3])));
                        }
                        break;
                        case "Circle": {
                            if (fields[1].equals(Material.PAPER.name()))
                                add(new Circle(Material.PAPER, Double.parseDouble(fields[2])));
                            if (fields[1].equals(Material.TAPE.name()))
                                add(new Circle(Material.TAPE, Double.parseDouble(fields[2])));
                        }
                        break;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void saveToFile(String fileName) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
                pw.println(name + " " + getFigureBox());
                for (int i = 0; i < currentSize; i++) {
                    pw.println(figures[i].fieldsToFileLine());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public Figure getByIndex(int i) {
            Figure figure = null;
            if (i >= 0 && i < currentSize) {
                figure = figures[i];
            }
            return figure;
        }

        public void show() {
            System.out.println(name + " " + getFigureBox());
            for (int i = 0; i < currentSize; i++) {
                System.out.println(figures[i]);
            }
        }

        public void delByIndex(int index) {
            System.arraycopy(figures, index + 1, figures, index, figures.length - index - 1);
            currentSize--;
            figures = Arrays.copyOf(figures, currentSize);
        }

        public void sortList() {
            Arrays.sort(figures);
        }

        @Override
        public String toString() {
            return "Box{" +
                    "number of figures in a box=" + currentSize +
                    '}';
        }
    }
}