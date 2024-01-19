package Lesson_15.Task5;

import Lesson_15.Task5.model.PersonList;
import Lesson_15.Task5.model.Student;

import java.io.File;

public class Main5 {
    public static void main(String[] args) {

        final String FILE_NAME = "Main" + File.separator +
                "src" + File.separator + "Lesson_15" +
                File.separator + "Task5" +
                File.separator + "data" +
                File.separator + "people.txt";

        PersonList personList1 = new PersonList();
        personList1.loadFromFile(FILE_NAME);
        personList1.show();
        personList1.add(new Student("Ira", 25, 7));
        personList1.sortByName();
        personList1.show();
        personList1.saveToFile(FILE_NAME);
    }
}
