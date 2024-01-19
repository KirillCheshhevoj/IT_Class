package Lesson_15.Task6.model;

public class Discount10Product extends Product {
    public Discount10Product(String name, double price) {
        super(name, price);
        discount = 10.0;
    }

    @Override
    public double getCost() {
        double cost = getPrice() - ((getPrice() / VALUE) * discount);
        return cost;
    }
}
