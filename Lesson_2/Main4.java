package Lesson_2;

public class Main4 {
    public static void main(String[] args) {


        // switch можа працаваць з целымі лічбамі, сімваламі, строкамі
        // і пералічэннямі (enum)

        int num1 = 2;
        switch (num1) {
            case 1:
                System.out.println("Autumn");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Summer");
                break;
            default:
                System.out.println("Something went wrong.");
                break;
        }

        int num2 = 0;
        String season = "Winter";
        switch (season) {
            case "Autumn":
                num2 = 1;
                break;
            case "Winter":
                num2 = 2;
                break;
            case "Spring":
                num2 = 3;
                break;
            case "Summer":
                num2 = 4;
                break;
            default:
                System.out.println("Something went wrong.");
                break;
        }
        System.out.println("num2: " + num2);

        String day1 = "Saturday";

        switch (day1) {
            case "Monday":
                System.out.println("Weekday");
                break;
            case "Tuesday":
                System.out.println("Weekday");
                break;
            case "Wednesday":
                System.out.println("Weekday");
                break;
            case "Thursday":
                System.out.println("Weekday");
                break;
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
                System.out.println("Weekend");
                break;
            case "Sunday":
                System.out.println("Weekend");
                break;
        }

        switch (day1) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday", "Sunday":
                System.out.println("Weekend");
                break;
        }

        switch (day1) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
        }

        num2 = switch (season) {
            case "Autumn" -> 1;
            case "Winter" -> 2;
            case "Spring" -> 3;
            case "Summer" -> {
                num1++;
                yield 2;
            }
            default -> {
                System.out.println("Something went wrong.");
                yield -1;
            }
        };

        System.out.println("num2 = " + num2);
    }
}
