package Lesson_25_remaind.utils;

import Lesson_25_remaind.exceptions.CompetitionException;
import Lesson_25_remaind.model.Animal;
import Lesson_25_remaind.model.Cat;
import Lesson_25_remaind.model.Dog;
import Lesson_25_remaind.model.Genus;
import lombok.experimental.UtilityClass;

import javax.naming.CommunicationException;

import java.time.LocalDate;

import static Lesson_25_remaind.constants.CompetitionConstants.*;

@UtilityClass
public class AnimalFactory {
    public static Animal getInstance(String textString) throws CompetitionException {
        String[] split = textString.split(DELIMETER);
        try {
            long chipNumber = Long.parseLong(validateStringMatches(split[0], CHIP_REGEX));
            String name = validateStringByEmpty(split[2]);
            LocalDate birthDate = LocalDate.parse(split[3], FORMATTER);
            String breed = validateStringByEmpty(split[4]);
            String email = validateStringMatches(split[5], EMAIL_REGEX);
            return split[1].equalsIgnoreCase("cat")
                    ? new Cat(chipNumber, Genus.of(split[1]), name, birthDate, breed, email)
                    : new Dog(chipNumber, Genus.DOG, name, birthDate, breed, email);
        } catch (IllegalStateException exception) {
            throw new CompetitionException(exception, textString);
        }
    }

    private static String validateStringMatches(String value, String regex) throws IllegalArgumentException {
        if (value.matches(regex)) {
            return value;
        }
        throw new IllegalStateException("Chip number or email has invalid format");
    }

    private static String validateStringByEmpty(String value) throws IllegalArgumentException {
        if (!value.isEmpty()) {
            return value;
        }
        throw new IllegalStateException("Name or breed is empty");
    }
}
