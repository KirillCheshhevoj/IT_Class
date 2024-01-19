package Lesson_9.exam1;

import Lesson_9.exam1.model.Person;
import Lesson_9.exam1.model.Season;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Season season1 = new Season();
        // Нельга створываць аб'екты класса пералічэнне (enum)

        Season season1 = Season.FALL;
        Season season2 = Season.FALL;

        // true - бо гэта адзін і той жа аб'ект
        System.out.println(season1.equals(season2));
        // true - бо спасылкі на адзін і той жа аб'ект
        System.out.println(season1 == season2);

        Season season3 = Season.WINTER;
        // false - бо гэта розныя аб'екты
        System.out.println(season1.equals(season3));
        // false - бо розныя спасылкі на розныя аб'екты
        System.out.println(season1 == season3);

        System.out.println(season1.name());
        System.out.println(season1.ordinal());
        System.out.println(season1);

        String tmpSeason = "spring";
        Season season4 = Season.valueOf(tmpSeason.toUpperCase());
        System.out.println(season4);


        System.out.println("------------------");


        switch (season4) {
            case WINTER:
                System.out.println("Сoldly");
                break;
            case FALL:
                System.out.println("Damp");
                break;
            case SPRING:
                System.out.println("Normally");
                break;
            case SUMMER:
                System.out.println("Warm");
                break;
            default:
                System.out.println("Something went wrong");
        }

        tmpSeason = "SUMMER";
        season2 = switch (tmpSeason) {
            case "WINTER", "SPRING", "SUMMER", "FALL" -> Season.valueOf(tmpSeason);
            default -> null;
        };

        System.out.println("All seasons of the year: ");
        for (Season season : Season.values()) {
            System.out.println(season);
        }

        System.out.println("------------------");

        Person person1 = new Person("Vasya", Season.FALL);
        System.out.println(person1);

        String tmpName = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        tmpName = scanner.nextLine();
        System.out.println("Enter season of the year: ");
        tmpSeason = scanner.nextLine();

        tmpSeason = tmpSeason.toUpperCase();
        Season season5 = switch (tmpSeason) {
            case "WINTER", "SPRING", "SUMMER", "FALL" -> Season.valueOf(tmpSeason);
            default -> null;
        };

        Person person2 = new Person(tmpName, season5);
        System.out.println(person2);
    }
}
