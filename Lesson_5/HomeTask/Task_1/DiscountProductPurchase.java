package Lesson_5.HomeTask.Task_1;

public class DiscountProductPurchase extends ProductPurchase {
    public DiscountProductPurchase(String name, double price, int number) {
        super(name, price, number);
    }

    private static final double DISCOUNT = 10.0;

    @Override
    public String toString() {
        return "DiscountProductPurchase{" +
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
