package Lesson_8.exam2.model;

public class Phone {
    private String model;
    private Battery battery;

    public Phone() {
        this(null, 1000);
    }

    public Phone(String model, int capacity) {
        this.model = model;
        this.battery = new Battery(capacity);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBatteryCapacity() {
        return battery.getCapacity();
    }

    // калі па логіцы гэты сетэр патрэбен
    public void setBatteryCapacity(int capacity) {
        battery.setCapacity(capacity);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", battery=" + battery +
                '}';
    }
}
