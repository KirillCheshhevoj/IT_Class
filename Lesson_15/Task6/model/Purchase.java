package Lesson_15.Task6.model;

public class Purchase {
    private Product product;
    private int amount;

    public Purchase(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public double getPricePurchase() {
        return (product.getCost() * amount);
    }

    public String fieldsToFileLine() {
        final String SEPARATOR = " ";
        String purchase = product.getClass().getSimpleName() + SEPARATOR + product.fieldsToFileLine() + SEPARATOR + amount;
        return purchase;
    }
}