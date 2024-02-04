package Lesson_27_xml_json._01_txt.utils;

import Lesson_27_xml_json._01_txt.exceptions.TxtException;
import Lesson_27_xml_json._01_txt.model.TxtCat;
import lombok.experimental.UtilityClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@UtilityClass
public class TxtCatUtils {
    private static final String PATH = "D:\\Java\\It_class\\Main\\src\\Lesson_27_xml_json\\_01_txt\\resources\\cats.csv";

    public static List<TxtCat> extract() {
        List<TxtCat> cats = new ArrayList<>();
        try (Scanner sc = new Scanner(new FileReader(PATH))) {
            while (sc.hasNextLine()) {
                try {
                    cats.add(TxtCatFactory.getInstance(sc.nextLine()));
                } catch (TxtException exception) {
                    System.out.println(exception);
                    System.out.println("Message: " + exception.getCause().getMessage());
                }
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        return cats;
    }

    public static void printCats(List<TxtCat> cats) {
        cats.forEach(System.out::println);
    }
}
