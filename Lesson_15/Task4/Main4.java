package Lesson_15.Task4;

import Lesson_15.Task4.model.Person;
import Lesson_15.Task4.model.PersonList;

import java.io.File;

public class Main4 {
    public static void main(String[] args) {
        final String FILE_NAME = "Main" + File.separator +
                "src" + File.separator + "Lesson_15" +
                File.separator + "Task4" +
                File.separator + "data" +
                File.separator + "people.txt";
        PersonList personList = new PersonList();
        personList.loadPersonFromFile(FILE_NAME);
        personList.showInfo();

        personList.deletePerson(400);
        personList.addPerson(new Person("Arthur", 45, 1750.5));

        System.out.println("====================================");
        personList.showInfo();
        personList.sortPeople();
        System.out.println("After sorting: ");
        personList.showInfo();
        personList.saveToFile(FILE_NAME);
    }
}
