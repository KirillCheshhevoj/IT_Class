package Lesson_21._02_new;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        LocalDate someDate = LocalDate.of(2023, 5, 15);
        System.out.println(dateNow.getYear());
        System.out.println(dateNow.get(ChronoField.YEAR));
        someDate.withYear(2022);
        System.out.println(someDate);
        System.out.println(someDate.isBefore(dateNow));
        someDate = someDate.plusYears(1);
        someDate = someDate.plus(1, ChronoUnit.YEARS);
        System.out.println(someDate);
        someDate = someDate.minusYears(2);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.format(DateTimeFormatter.ofPattern("dd MMMM y HH:mm:ss")));
        System.out.println(LocalDateTime.parse("15-86-2020 23:15:29", DateTimeFormatter.ofPattern("dd-MM-y HH:mm:ss"))
                .format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
