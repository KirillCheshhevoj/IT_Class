package Lesson_26_serialization._04_extended;

import java.io.*;

public class Main {
    private static final String PATH = "D:\\Java\\It_class\\Main\\src\\Lesson_26_serialization\\_04_extended\\resources\\save.sav";

    public static void main(String[] args) {
        ExtendedUser extendedUser = new ExtendedUser("Vasia Pupkin", "vasiok125", "Thi$ismYpa$$");
        try (ObjectOutput ou = new ObjectOutputStream(new FileOutputStream(PATH));
             ObjectInput oi = new ObjectInputStream(new FileInputStream(PATH))) {
            System.out.println(extendedUser);
            ou.writeObject(extendedUser);
            System.out.println("---------------------------");

            ExtendedUser fromFile = (ExtendedUser) oi.readObject();
            System.out.println(fromFile);
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
