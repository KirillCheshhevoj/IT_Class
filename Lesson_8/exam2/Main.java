package Lesson_8.exam2;

import Lesson_8.exam2.model.Battery;
import Lesson_8.exam2.model.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung", 3500);
        System.out.println(phone1);
        Battery battery = new Battery(4000);

        phone1 = null;

    }
}
