package Lesson_11.Task4.model;
///*4.11. Создать класс-обертку CarList, реализующий динамический массив
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
//автомобилей.*/

import Lesson_11.Task4.interfaces.IOwner;

import java.util.Arrays;

public class CarList {
    private static final int INITIAL_SIZE = 5;
    private static Car[] cars = new Car[INITIAL_SIZE];
    private static int currentSize = 0;

    public void addCar(Car car) {
        if (car != null) {
            if (currentSize == cars.length) {
                cars = Arrays.copyOf(cars, cars.length * 3 / 2 + 1);
            }
            cars[currentSize++] = car;
        }
    }

    public void addCars(Car... cars) {
        for (Car carObj : cars) addCar(carObj);
    }

    public void showCar() {
        for (int i = 0; i < currentSize; i++) System.out.println(cars[i]);
    }

    public Car getCarByIndex(int index) {
        Car carIndex = null;
        if (isValidIndex(index)) carIndex = cars[index];
        return carIndex;
    }

    public Integer getCarByParameter(Car car) {
        Integer index = null;
        for (int i = 0; i < currentSize; i++) {
            if (cars[i].equals(car)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public Car[] getCarsByOwner(IOwner owner) {
        int amountCarOwner = 0;
        for (int i = 0; i < currentSize; i++) {
            if (cars[i].getOwner().equals(owner)) amountCarOwner++;
        }

        Car[] carsOwner = new Car[amountCarOwner];
        int index = -1;
        for (int i = 0; i < currentSize; i++) {
            if (cars[i].getOwner().equals(owner)) carsOwner[++index] = cars[i];
        }
        return carsOwner;
    }

    public Truck[] getTrucks() {
        int amountTruck = 0;
        int index = -1;
        for (int i = 0; i < currentSize; i++) {
            if (cars[i] instanceof Truck) amountTruck++;
        }

        Truck[] trucks = (amountTruck > 0) ? new Truck[amountTruck] : null;
        for (int i = 0; i < currentSize; i++) {
            if (cars[i] instanceof Truck) trucks[++index] = (Truck) cars[i];
        }
        return trucks;
    }

    public PassengerCar[] getPassengerCar() {
        int amountCar = 0;
        int index = -1;
        for (int i = 0; i < currentSize; i++) {
            if (cars[i] instanceof PassengerCar) amountCar++;
        }

        PassengerCar[] passengerCars = (amountCar > 0) ? new PassengerCar[amountCar] : null;
        for (int i = 0; i < currentSize; i++) {
            if (cars[i] instanceof PassengerCar) passengerCars[++index] = (PassengerCar) cars[i];
        }
        return passengerCars;
    }

    public double getAvgCapacityLoadTrucks() {
        double sum = 0.0;
        Truck[] ts = getTrucks();
        for (Truck t : ts) sum += t.getCapacityLoad();
        return (sum / ts.length);
    }

    public int getAvgPassengerPlace() {
        int sum = 0;
        PassengerCar[] pcs = getPassengerCar();
        for (PassengerCar p : pcs) sum += p.getPassengerPlace();
        return (sum / pcs.length);
    }

    private boolean isValidIndex(int index) {
        return (index >= 0 && index < currentSize);
    }
}
