package Lesson_11.Task3.model;

import Lesson_11.Task3.interfaces.IPassengersAuto;

public class Hatchback extends Car implements IPassengersAuto {
    public Hatchback(String model, Color color, int stateNumber) {
        super(model, color, stateNumber);
    }

    @Override
    public int getPassengersCapacity() {
        return 5;
    }

    @Override
    public String toString() {
        return "Hatchback{" +
                "model='" + getModel() + '\'' +
                ", color=" + getColor() +
                ", stateNumber=" + getStateNumber() +
                ", passengersCapacity=" + getPassengersCapacity() +
                '}';
    }
}