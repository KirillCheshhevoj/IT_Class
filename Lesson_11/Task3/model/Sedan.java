package Lesson_11.Task3.model;

import Lesson_11.Task3.interfaces.IPassengersAuto;

public class Sedan extends Car implements IPassengersAuto {
    public Sedan(String model, Color color, int stateNumber) {
        super(model, color, stateNumber);
    }

    @Override
    public int getPassengersCapacity() {
        return 4;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model='" + getModel() + '\'' +
                ", color=" + getColor() +
                ", stateNumber=" + getStateNumber() +
                ", passengersCapacity=" + getPassengersCapacity() +
                '}';
    }
}
