package Lesson_8.exam2.model;

public class Battery {
    private int capacity;

    public Battery() {
    }

    public Battery(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "capacity=" + capacity +
                '}';
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
