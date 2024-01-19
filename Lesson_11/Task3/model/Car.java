package Lesson_11.Task3.model;

import Lesson_11.Task3.interfaces.ICargoAuto;
import Lesson_11.Task3.interfaces.IPassengersAuto;

import java.util.Arrays;
import java.util.Comparator;

public class Car implements Comparable<Car> {
    private String model;
    private Color color;
    private int stateNumber;

    public Car() {
    }

    public Car(String model, Color color, int stateNumber) {
        this.model = model;
        this.color = color;
        this.stateNumber = stateNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(int stateNumber) {
        this.stateNumber = stateNumber;
    }

    public static void showCars(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public static int getAvgPassengersCapacity(Car[] cars) {
        int sum = 0;
        int amount = 0;
        for (Car car : cars) {
            if (car instanceof IPassengersAuto) {
                sum += ((IPassengersAuto) car).getPassengersCapacity();
                amount++;
            }
        }
        return (sum / amount);
    }

    public static double getAvgLoadCapacity(Car[] cars) {
        double sum = 0;
        int amount = 0;
        for (Car car : cars) {
            if (car instanceof ICargoAuto) {
                sum += ((ICargoAuto) car).getLoadCapacity();
                amount++;
            }
        }
        return (sum / amount);
    }

    public static void sortByModel(Car[] cars) {
        /*Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().compareTo(o2.getModel());
            }
        });*/

        Arrays.sort(cars);
    }

    public static void sortByStateNumber(Car[] cars) {
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getStateNumber() - o2.getStateNumber();
            }
        });
    }

    public static void sortByColor(Car[] cars) {
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.color.ordinal() - o2.color.ordinal();
            }
        });
    }

    @Override
    public int compareTo(Car object) {
        if (model.compareTo(object.model) != 0)
            return model.compareTo(object.model);
        if ((color.ordinal() - object.color.ordinal()) != 0) {
            return (color.ordinal() - object.color.ordinal());
        }
        return (stateNumber - object.getStateNumber());
    }
}
