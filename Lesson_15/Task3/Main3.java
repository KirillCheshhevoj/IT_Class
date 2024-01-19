package Lesson_15.Task3;

import Lesson_15.Task3.model.Person;

import java.io.*;

public class Main3 {
    public static void main(String[] args) {
        final String INPUT_FILE = "Main" + File.separator +
                "src" + File.separator + "Lesson_15" +
                File.separator + "Task3" +
                File.separator + "data" +
                File.separator + "input.txt";
        final String OUTPUT_FILE = "Main" + File.separator +
                "src" + File.separator + "Lesson_15" +
                File.separator + "Task3" +
                File.separator + "data" +
                File.separator + "output.txt";
        Person person = null;

        /* try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE))) {
            String objString = br.readLine().trim();
            String[] fields = objString.split(" ");
            person = new Person(fields[0], Integer.parseInt(fields[1]), Double.parseDouble(fields[2]));
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

         */
        person = Person.loadPersonFromFile(INPUT_FILE);

        System.out.println(person);

        if (person.getAge() > 40) {
            person.setSalary(person.getSalary() * 2);
        }

        Person.savePersonToFile(OUTPUT_FILE, person);
        /*
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {


            bw.write(person.fieldsToFileLine());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        */
    }
}
