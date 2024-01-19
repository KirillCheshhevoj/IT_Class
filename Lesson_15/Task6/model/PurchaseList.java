package Lesson_15.Task6.model;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class PurchaseList {
    private final int INITIAL = 5;
    private Purchase[] purchases = new Purchase[INITIAL];
    private int currentSize = 0;

    public PurchaseList() {
    }

    public PurchaseList(Purchase[] purchases) {
        addPurchases(purchases);
    }

    public void add(Purchase purchase) {
        if (currentSize == purchases.length) {
            purchases = Arrays.copyOf(purchases, purchases.length * 3 / 2 + 1);
        }
        purchases[currentSize++] = purchase;
    }

    public void addPurchases(Purchase... purchases) throws NullPointerException {
        if (purchases == null) throw new NullPointerException();
        for (Purchase purchase : purchases) {
            add(purchase);
        }
    }

    public void addByFile(String fileName) {
        try (Scanner sc = new Scanner(new FileReader(fileName))) {
            while (sc.hasNext()) {
                String str = sc.nextLine();
                String[] fields = str.split(" ");

                switch (fields[0]) {
                    case "Product": {
                        Product product = new Product(fields[1], Double.parseDouble(fields[2]));
                        Purchase purchase = new Purchase(product, Integer.parseInt(fields[3]));
                        add(purchase);
                    }
                    break;
                    case "Discount10Product": {
                        Product product = new Discount10Product(fields[1], Double.parseDouble(fields[2]));
                        Purchase purchase = new Purchase(product, Integer.parseInt(fields[3]));
                        add(purchase);
                    }
                    break;
                    case "Discount25Product": {
                        Product product = new Discount25Product(fields[1], Double.parseDouble(fields[2]));
                        Purchase purchase = new Purchase(product, Integer.parseInt(fields[3]));
                        add(purchase);
                    }
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveToFile(String fileName) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < currentSize; i++) {
                pw.println(purchases[i].fieldsToFileLine());
            }
            String str = "The average cost of purchases with a discount of 25% = " + getAvgCost();
            pw.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void showPurchases() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(purchases[i].fieldsToFileLine());
        }
    }

    public double getAvgCost() {
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < currentSize; i++) {
            if (purchases[i].getProduct() instanceof Discount25Product) {
                sum += purchases[i].getPricePurchase();
                counter++;
            }
        }
        return (sum / counter);
    }
}
