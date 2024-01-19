package Lesson_11.Task3;

import Lesson_11.Task3.model.*;

// 3.1. Создать класс Car c полями модель, цвет(перечисление), гос. номер.
//3.2. Создать 2 интерфейса: IPassangersAuto и ICargoAuto, с методами,
//возвращающими соответственно максимальное количество пассажиров и
//максимальный вес груза
//3.3. Создать классы Sedan, Hatchback, Truck, наследующие от класса Car и
//реализующие подходящие по смыслу интерфейсы (Sedan и Hatchback –
//IPassangersAuto, Truck - ICargoAuto).
//3.4. Cоздать классы Pickup и Minibus, наследующие от класса Car и реализующие
//оба интерфейса
//3.5. Создать массив с информацией о двух автомобилях каждого класса
//3.6. Создать статический метод в классе Car, принимающий массив автомобилей и
//выводящий о них всю информацию.
//3.7. Создать статический метод в классе Car, принимающий массив автомобилей и
//возвращающий среднюю пассажироемкость автомобилей, реализующих
//соответствующий интерфейс IPassangersAuto.
//3.8. Создать статический метод в классе Car, принимающий массив автомобилей и
//возвращающий среднюю грузоподъемность автомобилей, реализующих
//соответствующий ICargoAuto.
//3.9. Создать статический метод в классе Car, осуществляющий сортировку
//автомобилей по модели по алфавиту (использовать Comparable или Comparator по
//желанию).
//3.10. Создать статический метод в классе Car, осуществляющий сортировку в
//соответствии порядковыми значениями цветов перечисления Цвет(сортировка в
//соответствии с методом ordinal(), мы разбирали этот метод), используя интерфейс
//компаратор и анонимный класс
//3.11. Продемонстрировать работу статических методов.*/
public class Main {
    public static void main(String[] args) {

        Car[] cars = {
                new Pickup("TOYOTA", Color.WHITE, 3791),
                new Pickup("DODGE", Color.BLACK, 3357),
                new Hatchback("OPEL", Color.BLACK, 5748),
                new Hatchback("SKODA", Color.BLUE, 9974),
                new Minibus("GAZEL-NEXT", Color.GREY, 3107),
                new Minibus("VOLKSWAGEN", Color.RED, 8574),
                new Sedan("FORD", Color.BLACK, 1055),
                new Sedan("AUDI", Color.WHITE, 7849),
                new Truck("MAZ-MAN", Color.BLACK, 9984),
                new Truck("KAMAZ", Color.BLUE, 7777)
        };

        Car.showCars(cars);
        System.out.printf("Average passenger capacity: %d person%n", Car.getAvgPassengersCapacity(cars));
        System.out.printf("Average load capacity: %.1f tonne %n", Car.getAvgLoadCapacity(cars));
        Car.sortByModel(cars);
        System.out.println("-------Sorted array of cars by model-------");
        Car.showCars(cars);
        Car.sortByStateNumber(cars);
        System.out.println("-------Sorted array of cars by stateNumber-------");
        Car.showCars(cars);
        Car.sortByColor(cars);
        System.out.println("-------Sorted array of cars by color-------");
        Car.showCars(cars);
    }
}
