package Lesson_2.HomeTaskString;

// Есть строка: «Петр узнал свою оценку и огорчился».
// Если в предложение входит подстрока «оценку» - вывести ее.
// Определить заканчивается ли предложение подстрокой «огорчил».
// Определить заканчивается ли предложение подстрокой «огорчился».
public class Task2 {
    public static void main(String[] args) {
        String str = "Петр узнал свою оценку и огорчился";
        if (str.contains("оценку")) {
            System.out.println("оценку");
        } else {
            System.out.println("Not find line.");
        }

        System.out.println("End string огорчил: " + str.endsWith("огорчил"));
        System.out.println("End string огорчился: " + str.endsWith("огорчился"));

    }
}
