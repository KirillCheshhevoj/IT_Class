package Lesson_15.Task6;

import Lesson_15.Task6.model.*;

import java.io.File;

public class Main6 {
    public static void main(String[] args) {
        final String INITIAL_DATA = "Main" + File.separator +
                "src" + File.separator + "Lesson_15" +
                File.separator + "Task6" +
                File.separator + "data" +
                File.separator + "initialData.txt";
        final String FINAL_DATA  = "Main" + File.separator +
                "src" + File.separator + "Lesson_15" +
                File.separator + "Task6" +
                File.separator + "data" +
                File.separator + "finalData.txt";
        PurchaseList list = new PurchaseList();

        list.addByFile(INITIAL_DATA);
        list.add(new Purchase(new Discount25Product("Coffee", 2.8), 4));
        list.add(new Purchase(new Discount10Product("Tea", 1.5), 2));
        list.saveToFile(FINAL_DATA);
        list.add(new Purchase(new Discount25Product("Hot Dog", 5.5), 2));
        list.saveToFile(FINAL_DATA);
        System.out.println("Program completed successfully,");
        System.out.println("all data about purchases and average cost, ");
        System.out.println("written in a file at ->" + FINAL_DATA);
    }
}
