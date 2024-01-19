package Lesson_5.HomeTask.Task_3;

/*3. Площади и периметры фигур
        3.1 Создайте класс Figure.
        3.2 Создайте класс Rectangle, наследуемый от класса Figure.
        3.3 Дополните класс Rectangle необходимыми полями.
        3.4 Создайте класс Сircle, наследуемый от класса Figure.
        3.5 Дополните класс Circle необходимыми полями.
        3.6 Создайте класс Triangle, наследуемый от класса Figure.
        3.7 Дополните класс Triangle необходимыми полями.
        3.8 Создайте конструкторы и методы доступа к полям для всех классов.
        3.9 В классе Figure определитe метод getSquare() и getPerimeter(). В классах потомках
        переопределить методы getSquare() и getPerimeter(), возвращающие подсчитанные
        площадь и периметр.
        3.10 В классах должны быть переопределены методы toString(), hashCode() и equals()
        (equals - фигуры считаются одинаковыми, если их площади равны или равны с заданной
        точностью).
        3.11 Создайте массив фигур, состоящий из 9 фигур, по 3 на каждый класс.
        3.13 Используя цикл foreach, выведите информацию о каждом объекте (метод toString()).
        3.14 Найдите общую площадь всех фигур
        3.15 Найдите фигуры с минимальным и максимальным периметром
        3.16 Найти в массиве все фигуры, равные введённой (используя
        переопределённый метод equals)*/

public class Main {
    public static void main(String[] args) {
        final int NUMBER_OF_FIGURES = 9;
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        figures[0] = new Triangle(3.0,4.0,5.0);
        figures[1] = new Triangle(2.0,6.0,7.0);
        figures[2] = new Triangle(3.0,7.0,9.0);
        figures[3] = new Rectangle(3.0, 2.0);
        figures[4] = new Rectangle(5.0, 8.0);
        figures[5] = new Rectangle(12.0, 0.5);
        figures[6] = new Circle(7);
        figures[7] = new Circle(15.0);
        figures[8] = new Circle(4.0);

        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }

        System.out.printf("Общая площадь всех фигур: %.2f %n", Figure.getTotalSquare(figures));

        Figure[] minFigurePerimeter = Figure.getFigureMinPerimeter(figures);
        Figure[] maxFigurePerimeter = Figure.getFigureMaxPerimeter(figures);


        System.out.println("Фигуры с наименьшим периметром");
        for (Figure figure : minFigurePerimeter) {
            System.out.println(figure);
        }

        System.out.println("Фигуры с наибольшим периметром");
        for (Figure figure : maxFigurePerimeter) {
            System.out.println(figure);
        }

        System.out.println("Фигуры равные по площади, для " + figures[0]);
        for (int i = 1; i< figures.length; i++){
            if (figures[0].equals(figures[i])){
                System.out.println(figures[i]);
            }
        }
    }
}
