package Lesson_11.Task4.model;

import Lesson_11.Task4.interfaces.IOwner;

public class PassengerCar extends Car{
    private int passengerPlace;

    public PassengerCar(Model model, Color color, int mileage, double enginePower, IOwner owner, int passengerPlace) {
        super(model, color, mileage, enginePower, owner);
        this.passengerPlace = passengerPlace;
    }

    public int getPassengerPlace() {
        return passengerPlace;
    }

    @Override
    public boolean equals(Object o) {
        return (super.equals(o));
    }

    @Override
    public int hashCode() {
        return passengerPlace;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "model=" + getModel() +
                ", color=" + getColor() +
                ", mileage=" + getMileage() +
                ", enginePower=" + getEnginePower() +
                ", owner=" + getOwner() +
                ", passengerPlace=" + passengerPlace +
                '}';
    }
}
