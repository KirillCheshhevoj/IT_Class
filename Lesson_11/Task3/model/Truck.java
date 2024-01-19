package Lesson_11.Task3.model;

import Lesson_11.Task3.interfaces.ICargoAuto;

public class Truck extends Car implements ICargoAuto {
    public Truck(String model, Color color, int stateNumber) {
        super(model, color, stateNumber);
    }

    @Override
    public double getLoadCapacity() {
        double minLoad  = 3.5;
        return (minLoad + getColor().ordinal());
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + getModel() + '\'' +
                ", color=" + getColor() +
                ", stateNumber=" + getStateNumber() +
                ", loadCapacity=" + getLoadCapacity() +
                '}';
    }
}