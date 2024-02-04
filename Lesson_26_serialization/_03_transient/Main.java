package Lesson_26_serialization._03_transient;

import java.io.*;
import java.util.Arrays;

public class Main {

    private static final String PATH_TO_FILE = "D:\\Java\\It_class\\Main\\src\\Lesson_26_serialization\\_03_transient\\resources\\cat.save";

    public static void main(String[] args) {
        StandardCat vaska = new StandardCat("Vaska",
                new StandardBox(Arrays.asList("Mouse", "Ball")));
        System.out.println(vaska);

        try (FileOutputStream os = new FileOutputStream(PATH_TO_FILE);
             ObjectOutputStream oos = new ObjectOutputStream(os);
             FileInputStream is = new FileInputStream(PATH_TO_FILE);
             ObjectInputStream ois = new ObjectInputStream(is)) {
            oos.writeObject(vaska);
            System.out.println(vaska);
            StandardCat.STATIC_FIELD = "new value";

            StandardCat fromFile = (StandardCat) ois.readObject();
            System.out.println(fromFile);

        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
