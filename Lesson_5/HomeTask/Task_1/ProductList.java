package Lesson_5.HomeTask.Task_1;

import java.util.Arrays;

public class ProductList {
    private static final int INITIAL_SIZE = 8;
    private ProductPurchase[] productPurchases = new ProductPurchase[INITIAL_SIZE];
    private int currentSize = 0;

    public void addProduct(ProductPurchase product) {
        if (product != null) {
            if (currentSize == productPurchases.length) {
                productPurchases = Arrays.copyOf(productPurchases, productPurchases.length * 3 / 2 + 1);
            }
            productPurchases[currentSize++] = product;
        }
    }

    public void addProducts(ProductPurchase... productPurchases) {
        for (ProductPurchase productPurchase : productPurchases) {
            addProduct(productPurchase);
        }
    }

    private boolean isValidIndex(int index) {
        return (index >= 0 && index < currentSize);
    }

    public void showProductByIndex(int index) {
        if (isValidIndex(index)) {
            System.out.println(productPurchases[index]);
        }
    }

    public void showProducts() {
        System.out.println("Capacity = " + productPurchases.length);
        System.out.println("CurrentSize = " + currentSize);
        for (int i = 0; i < currentSize; i++) {
            System.out.println(productPurchases[i]);
        }
    }

    public void delProductByIndex(int index) {
        if (isValidIndex(index))
            System.arraycopy(productPurchases, index + 1, productPurchases, index, currentSize - index - 1);
        currentSize--;
    }

    public double getTotalCostNoDiscount() {
        double totalCost = 0.0;
        for (int i = 0; i < currentSize; i++) {
            totalCost += (productPurchases[i].number * productPurchases[i].price);
        }
        return totalCost;
    }

    public double getTotalCostTheDiscount() {
        double totalCost = 0.0;
        for (int i = 0; i < currentSize; i++) {
            totalCost += productPurchases[i].getGeneralCost();
        }
        return totalCost;
    }
}
