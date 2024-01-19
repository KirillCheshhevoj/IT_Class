package Lesson_11.Task4.model;

import Lesson_11.Task4.interfaces.IOwner;

public abstract class Car {
    private Model model;
    private Color color;
    private int mileage;
    private double enginePower;
    private IOwner owner;

    public Car(Model model, Color color, int mileage, double enginePower, IOwner owner) {
        this.model = model;
        this.color = color;
        this.mileage = mileage;
        this.enginePower = enginePower;
        this.owner = owner;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public IOwner getOwner() {
        return owner;
    }

    public void setOwner(IOwner owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (model == car.model) return true;
        if (color == car.color) return true;
        if (mileage == car.mileage) return true;
        if (Double.compare(car.enginePower, enginePower) != 0) return false;
        return owner != null ? owner.equals(car.owner) : car.owner == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = model != null ? model.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + mileage;
        temp = Double.doubleToLongBits(enginePower);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        return result;
    }
}
