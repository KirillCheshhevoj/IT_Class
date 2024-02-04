package Lesson_27_xml_json._01_txt.utils;

import Lesson_27_xml_json._01_txt.exceptions.TxtException;
import Lesson_27_xml_json._01_txt.model.TxtCat;
import lombok.experimental.UtilityClass;

import java.util.Arrays;

@UtilityClass
public class TxtCatFactory {
    private static final String DELIMITER = ",";

    public static TxtCat getInstance(String string) throws TxtException {
        String[] split = string.split(DELIMITER);
        try {
            validateArrayLength(split.length);
            validateForInteger(split[0], split[2]);
            int regNumber = validateNegative(Integer.parseInt(split[0]));
            String name = validateEmpty(split[1]);
            int age = validateNegative(Integer.parseInt(split[2]));
            return new TxtCat(regNumber, name, age);
        } catch (IllegalStateException exception) {
            throw new TxtException(string, exception);
        }
    }

    private static void validateArrayLength(int length) {
        if (length != 3) {
            throw new IllegalStateException("Wrong line format");
        }
    }

    private static void validateForInteger(String... strings) {
        try {
            Arrays.stream(strings).forEach(Integer::parseInt);
        } catch (NumberFormatException exception) {
            throw new IllegalStateException("Number or age is not a integer");
        }
    }

    private static int validateNegative(int value) {
        if (value <= 0) {
            throw new IllegalStateException("Negative value for regNumber or age");
        }
        return value;
    }

    private static String validateEmpty(String name) {
        if (name.isEmpty()) {
            throw new IllegalStateException("Name is empty");
        }
        return name;
    }
}
