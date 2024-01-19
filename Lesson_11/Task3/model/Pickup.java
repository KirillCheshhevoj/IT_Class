package Lesson_11.Task3.model;

import Lesson_11.Task3.interfaces.ICargoAuto;
import Lesson_11.Task3.interfaces.IPassengersAuto;

public class Pickup extends Car implements IPassengersAuto, ICargoAuto {
    public Pickup(String model, Color color, int stateNumber) {
        super(model, color, stateNumber);
    }

    @Override
    public double getLoadCapacity() {
        return (getColor().ordinal() + 1);
    }

    @Override
    public int getPassengersCapacity() {
        return 2;
    }

    @Override
    public String toString() {
        return "Pickup{" +
                "model='" + getModel() + '\'' +
                ", color=" + getColor() +
                ", stateNumber=" + getStateNumber() +
                ", loadCapacity=" + getLoadCapacity() +
                ", passengersCapacity=" + getPassengersCapacity() +
                '}';
    }
}
