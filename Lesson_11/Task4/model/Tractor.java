package Lesson_11.Task4.model;

import Lesson_11.Task4.interfaces.ICargo;
import Lesson_11.Task4.interfaces.IOwner;

public class Tractor extends Car implements ICargo {
    private double maxCapacityLoad;

    public Tractor(Model model, Color color, int mileage, double enginePower, IOwner owner, double maxCapacityLoad) {
        super(model, color, mileage, enginePower, owner);
        this.maxCapacityLoad = maxCapacityLoad;
    }

    @Override
    public double getCapacityLoad() {
        return maxCapacityLoad;
    }

    @Override
    public boolean equals(Object o) {
        return (super.equals(o));
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(maxCapacityLoad);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "model=" + getModel() +
                ", color=" + getColor() +
                ", mileage=" + getMileage() +
                ", enginePower=" + getEnginePower() +
                ", owner=" + getOwner() +
                ", maxCapacityLoad=" + maxCapacityLoad +
                '}';
    }
}