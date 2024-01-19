package Lesson_5.HomeTask.Task_1;

public class DiscountRedProductPurchase extends ProductPurchase {
    private static final double DISCOUNT = 50.0;

    public DiscountRedProductPurchase(String name, double price, int number) {
        super(name, price, number);
    }

    @Override
    public String toString() {
        return "DiscountRedProductPurchase{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", number=" + getNumber() +
                ", generalCost= " + getGeneralCost() +
                '}';
    }

    @Override
    public double getGeneralCost() {
        double discount = getPrice() - (getPrice() / DISCOUNT);
        return (discount * getNumber());
    }
}
