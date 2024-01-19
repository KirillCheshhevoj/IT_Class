package Lesson_8.exam1.model;

public class Flat {
    private String address;

    public Flat() {
    }

    public Flat(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "address='" + address + '\'' +
                '}';
    }
}
