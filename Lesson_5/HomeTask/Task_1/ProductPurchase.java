package Lesson_5.HomeTask.Task_1;

public class ProductPurchase {
    private String name;
    protected  double price;
    protected  int number;

    public ProductPurchase() {
        name = null;
        price = 0.0;
        number = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ProductPurchase(String name, double price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public double getGeneralCost() {
        return (price * (double) number);
    }

    @Override
    public String toString() {
        return "ProductPurchase{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", generalCost= " + getGeneralCost() +
                '}';
    }

    public static double getTotalCostNoDiscount(ProductPurchase[] purchases) {
        double totalCost = 0.0;
        for (int i = 0; i < purchases.length; i++) {
            totalCost += (purchases[i].number * purchases[i].price);
        }
        return totalCost;
    }

    public static double getTotalCostTheDiscount(ProductPurchase[] purchases) {
        double totalCost = 0.0;
        for (int i = 0; i < purchases.length; i++) {
            totalCost += purchases[i].getGeneralCost();
        }
        return totalCost;
    }
}
