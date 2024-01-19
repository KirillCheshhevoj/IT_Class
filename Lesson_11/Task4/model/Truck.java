package Lesson_11.Task4.model;

import Lesson_11.Task4.interfaces.ICargo;
import Lesson_11.Task4.interfaces.IOwner;

public class Truck extends Car implements ICargo {
    private double maxCapacityLoad;
    private double maxCapacityBodyVolume;

    public Truck(Model model, Color color, int mileage, double enginePower, IOwner owner, double maxCapacityLoad, double maxCapacityBodyVolume) {
        super(model, color, mileage, enginePower, owner);
        this.maxCapacityLoad = maxCapacityLoad;
        this.maxCapacityBodyVolume = maxCapacityBodyVolume;
    }

    @Override
    public double getCapacityBodyVolume() {
        return maxCapacityBodyVolume;
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
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(maxCapacityLoad);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(maxCapacityBodyVolume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model=" + getModel() +
                ", color=" + getColor() +
                ", mileage=" + getMileage() +
                ", enginePower=" + getEnginePower() +
                ", owner=" + getOwner() +
                ", maxCapacityLoad=" + maxCapacityLoad +
                ", maxCapacityBodyVolume=" + maxCapacityBodyVolume +
                '}';
    }
}
