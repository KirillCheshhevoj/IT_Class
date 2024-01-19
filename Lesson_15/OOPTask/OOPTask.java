package Lesson_15.OOPTask;

import Lesson_15.OOPTask.exception.*;
import Lesson_15.OOPTask.model.color.Color;
import Lesson_15.OOPTask.model.figures.*;
import Lesson_15.OOPTask.model.material.Material;
import Lesson_15.OOPTask.model.person.Person;
import java.io.File;

public class OOPTask {
    public static void main(String[] args) {
        final String INITIAL = "Main" + File.separator +
                "src" + File.separator + "Lesson_15" +
                File.separator + "OPPTask" +
                File.separator + "data" +
                File.separator + "initial.txt";
        final String FINAL = "Main" + File.separator +
                "src" + File.separator + "Lesson_15" +
                File.separator + "OPPTask" +
                File.separator + "data" +
                File.separator + "final.txt";
        Person girl = new Person("Masha");//создаём объект девочку
        //на этом этапе у неё имеется только материал пленка и бесцветная бумага (безразмерные)
        //а также пустая коробка для фигур
        girl.getFigureBox().addFromFile(INITIAL);//считываем исходные данные
        // файл содержит разнообразные фигуры
        //после считывания, фигуры добавляются (метод addFromFile) в коробку девочки Маша
        girl.getFigureBox().show();//выводим на консоль список фигур в коробке Маши
        girl.getFigureBox().getByIndex(7).setColor(Color.GREEN);//изменяем цвет случайной фигуры (индекс 7)
        girl.getFigureBox().getByIndex(8).setColor(Color.GREEN);//изменяем цвет случайной фигуры (индекс 8)
        //на фигуре с индексом 8 программа выдаст исключение ImpossibleToColorException
        // т.к. у фигуры из пленки цвет изменить нельзя
        girl.getFigureBox().show();//выводим на консоль список фигур в коробке Маши
        girl.cutNewCircle(Material.PAPER, 8);//девочка вырезает из бумаги круг с радиусом 8
        girl.getFigureBox().add(girl.getFigure());//девочка кладет круг с радиусом 8 в коробку
        girl.cutNewRectangle(Material.TAPE, 3, 5);//девочка вырезает из пленки прямоугольник со сторонами 3 и 5
        girl.getFigureBox().add(girl.getFigure());//прямоугольник кладет в коробку
        girl.getFigureBox().show();//выводим на консоль список фигур в коробке Маши
        girl.cutCircleFromFigure(10, 2);//берем из коробки фигуру под индексом 10 (там сейчас прямоугольник)
        //и из нее вырезаем круг радиусом 2
        //!!!ДЛЯ ОПРЕДЕЛЕНИЯ ВОЗМОЖНОСТИ ВЫРЕЗАНИЯ ОДНОЙ ФИГУРЫ ИЗ ДРУГОЙ,
        // СРАВНИВАЛ ПЛОЩАДИ ФИГУР (в реальности это не верно)
        girl.getFigureBox().show();//снова выводим на консоль и увидим в коробке последнюю фигуру уже другой формы
        //теперь удалим её из коробки
        girl.getFigureBox().delByIndex(10);
        girl.getFigureBox().show();//снова выводим на консоль
        //теперь для наглядности девочка вырежет несколько новых фигур, сложит их в коробку
        //и полученный результат запишем в конечный файл
        girl.cutNewTriangle(Material.PAPER, 30, 40, 50);//новый треугольник
        girl.cutRectangleFromFigure(10, 15);//девочка предыдущий треугольник ещё не положила в коробку,
        // а передумала и из него вырезала прямоугольник:)))
        girl.getFigure().setColor(Color.GREEN);//красим наш прямоугльник в зелёный
        girl.getFigureBox().add(girl.getFigure());//кладём прямоугольник в коробку
        girl.cutNewCircle(Material.TAPE, 55);//вырезаем новый круг из пленки
        girl.getFigureBox().add(girl.getFigure());//кладём круг в коробку
        girl.cutNewRectangle(Material.PAPER, 1, 2);//вырезаем из бумаги новый прямоугольник (в коробку не кладём)
        girl.cutTriangleFromFigure(30, 40, 50);//из прямоугольника пробуем вырезать треугольник по размерам больше,
        //этого сделать не удастся и программа выдаст исключение InsufficientMaterialException
        girl.cutNewCircle(Material.PAPER, 7);//вырезаем новый круг
        girl.getFigure().setColor(Color.GREEN);//красим в зеленый
        girl.getFigure().setColor(Color.RED);//пробуем перекрасить из зелёного в красный
        // и получаем исключение ImpossibleToColorException

        //записываем список фигур в нашей коробке в файл final.txt
        girl.getFigureBox().saveToFile(FINAL);
    }
}
