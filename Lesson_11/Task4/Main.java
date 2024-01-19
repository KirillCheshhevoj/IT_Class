package Lesson_11.Task4;

import Lesson_11.Task4.model.*;
import Lesson_11.Task4.interfaces.*;

// /*Задача 4:
//4.1. Создать абстрактный класс Car, содержащий информацию об автомобиле:
//модель, пробег, цвет, мощность двигателя, владелец и др.
//4.2. Создать интерфейс IOwner, содержащий методы, возвращающие информацию
//о владельце (номер и имя) автомобиля.
//4.6. Поле владелец определить как переменную интерфейса IOwner.
//4.2. Создать интерфейс ICargo с методами, возвращающими грузоподъёмность
//грузовика и объём кузова.
//4.3. Создать класс Entity (юр. лицо) с полями УНП и наименование организации,
//реализующий интерфейс Owner.
//4.5. Создать класс Person с полями номер паспорта и ФИО, реализующий
//интерфейс Owner
//4.6. Для классов Entity и Person переопределить hashCode, equals, toString
//4.7. Создать класс Truck с полями максимальная грузоподъемность и объем кузова,
//унаследовав его от класса Car и реализовав интерфейс ICargo
//4.8. Создать класс Tractor с полем максимальная грузоподъемность, унаследовав
//его от класса Car и реализовав интерфейс ICargo (отсутствие кузова у трактора
//заставляет задуматься о default методе в ICargo, возвращающем 0)
//4.9. Создать класс PassengerCar с полем кол-во пассажирских мест унаследовав его
//от класса Car.
//4.10. Для автомобилей переопределить методы hashCode, equals, toString
//4.11. Создать класс-обертку CarList, реализующий динамический массив
//автомобилей Car, расширяемый на 50% при уже полностью заполненном массиве
//4.12. В классе CarList организовать возможность
//- добавления одного автомобиля,
//- добавления массива автомобилей,
//- вывода информации обо всех автомобилях,
//- поиск автомобиля по индексу (возвращает автомобиль)
//- поиск автомобиля по параметру (принимает автомобиль сравнение с помощью
//equals, возвращает индекс первого совпадения)
//- поиск по владельцу (возвращает массив все автомобилей принадлежащих
//указанному владельцу).
//- метод, возвращающий массив только грузовых автомобилей
//- метод, возвращающий массив пассажирских автомобилей
//- метод, возвращающий среднюю грузоподъемность грузовых автомобилей
//- метод, возвращающий среднюю пассажировместимость пассажирских
//автомобилей.
//4.13. Создать по 2 автомобиля разных типов:
//- легковой с владельцем «физическое лицо»;
//- легковой с владельцем «юридическое лицо»;
//- грузовой с владельцем «физическое лицо»;
//- грузовой с владельцем «юридическое лицо».
//4.14. Продемонстрировать работу методов класса
public class Main {
    public static void main(String[] args) {
        IOwner ownerPerson = new Person("Alexandr", "724031994HB052KB3");
        IOwner ownerEntity = new Entity("AUTOPARK", "100518101");
        Car[] cars = {
                new PassengerCar(Model.FORD, Color.BLUE, 74200, 158, ownerPerson, 4),
                new PassengerCar(Model.AUDI, Color.RED, 147000, 200, ownerEntity, 5),
                new Truck(Model.MAZ, Color.BLACK, 124789, 500, ownerPerson, 15, 16),
                new Truck(Model.VOLVO, Color.WHITE, 547800, 750, ownerEntity, 25, 30),
                new Tractor(Model.BELARUS, Color.RED, 5000, 250, ownerPerson, 3.2),
                new Tractor(Model.BMW, Color.GREY, 100, 180, ownerEntity, 1.4)
        };

        CarList carList = new CarList();
        System.out.println("-------Add one auto-------");
        carList.addCar(new PassengerCar(Model.SKODA, Color.GREY, 10000, 200, ownerPerson, 5));
        carList.showCar();
        System.out.println("-------Add massive auto-------");
        carList.addCars(cars);
        carList.showCar();
        System.out.println("-------Displaying information about all cars-------");
        carList.showCar();
        System.out.println("-------Car search by index (returns the car)-------");
        System.out.println(carList.getCarByIndex(3));
        System.out.println("------- Search for a car by parameter-------");
        System.out.println(carList.getCarByParameter(new Truck(Model.VOLVO, Color.GREY, 5751, 530, ownerEntity, 25, 30)));
        System.out.println("-------Search by owner-------");
        Car[] carsByOwner = carList.getCarsByOwner(ownerEntity);
        for (Car car : carsByOwner) {
            System.out.println(car);
        }
        System.out.println("-------A method that returns an array of trucks only-------");
        Truck[] trucks = carList.getTrucks();
        for (Truck truck : trucks) {
            System.out.println(truck);
        }
        System.out.println("-------A method that returns an array of passenger cars-------");
        PassengerCar[] pcs = carList.getPassengerCar();
        for (PassengerCar pc : pcs) {
            System.out.println(pc);
        }
        System.out.println("-------A method that returns the average load capacity of trucks-------");
        System.out.println(carList.getAvgCapacityLoadTrucks());
        System.out.println("-------A method that returns the average passenger capacity of passenger-------");
        System.out.println(carList.getAvgPassengerPlace());

    }
}
