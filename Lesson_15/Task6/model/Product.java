package Lesson_15.Task6.model;

public class Product {
    protected final static double VALUE = 100.0;
    private String name;
    private double price;
    protected double discount;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getCost() {
        return price;
    }

    public String fieldsToFileLine() {
        final String SEPARATOR = " ";
        String product = name + SEPARATOR + price;
        return product;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", cost=" + getCost() +
                '}';
    }
}
