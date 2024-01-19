package Lesson_11.Task3.model;

import Lesson_11.Task3.interfaces.ICargoAuto;
import Lesson_11.Task3.interfaces.IPassengersAuto;

public class Minibus extends Car implements IPassengersAuto, ICargoAuto {
    public Minibus(String model, Color color, int stateNumber) {
        super(model, color, stateNumber);
    }

    @Override
    public double getLoadCapacity() {
        double minLoad = 1.5;
        return (minLoad + getColor().ordinal());
    }

    @Override
    public int getPassengersCapacity() {
        int minPassenger = 8;
        return (minPassenger + getColor().ordinal());
    }

    @Override
    public String toString() {
        return "Minibus{" +
                "model='" + getModel() + '\'' +
                ", color=" + getColor() +
                ", stateNumber=" + getStateNumber() +
                ", loadCapacity=" + getLoadCapacity() +
                ", passengersCapacity=" + getPassengersCapacity() +
                '}';
    }
}