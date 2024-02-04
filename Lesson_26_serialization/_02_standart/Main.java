package Lesson_26_serialization._02_standart;

import java.io.*;

public class Main {
    private static final String PATH_TO_FILE = "D:\\Java\\It_class\\Main\\src\\Lesson_26_serialization\\_02_standart\\resources\\save.sav";

    public static void main(String[] args) {
        Child child = new Child(1);
//        System.out.println(child);
        try (FileOutputStream os = new FileOutputStream(PATH_TO_FILE);
             ObjectOutputStream oos = new ObjectOutputStream(os);
             FileInputStream is = new FileInputStream(PATH_TO_FILE);
             ObjectInputStream ois = new ObjectInputStream(is)) {
//
//            Cat vaska = new Cat("Vaska", 5);
//            oos.writeObject(vaska);
//
//            Cat petka = (Cat) ois.readObject();
//            System.out.println(petka);
//
            System.out.println("Serialize");
            oos.writeObject(child);

            System.out.println("DeSerialize");
            Child child1 = (Child) ois.readObject();
            System.out.println(child1);
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
