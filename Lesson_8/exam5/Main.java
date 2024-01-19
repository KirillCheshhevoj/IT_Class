package Lesson_8.exam5;

import Lesson_8.exam5.model.Child;

public class Main {
    public static void main(String[] args) {
        Child child = new Child("Igor", 5);
        System.out.println(child);
        child.sleep();
        System.out.println(child);
    }
}
