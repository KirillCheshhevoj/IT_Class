package Lesson_4.HomeTask.Task6;

public class Temperature {
    final static double DIFFERENCE = 32.0;
    final static double COEFFICIENT = 9.0 / 5.0;

    public static double convertToFahrenheit(double celsius) {
        final double COEFFICIENT = 9.0 / 5.0;
        return COEFFICIENT * celsius + DIFFERENCE;
    }

    public static double convertToCelsius(double fahrenheit) {
        return (1 / COEFFICIENT) * (fahrenheit - DIFFERENCE);
    }
}
