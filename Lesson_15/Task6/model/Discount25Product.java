package Lesson_15.Task6.model;

public class Discount25Product extends Product{
    public Discount25Product(String name, double price) {
        super(name, price);
        discount = 25.0;
    }

    @Override
    public double getCost() {
        double cost = getPrice() - ((getPrice() / VALUE) * discount);
        return cost;
    }
}
