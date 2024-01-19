package Lesson_2.HomeTaskString;

// Дана строка: « Привет. Как дела? »
// Очистить в строке пробелы вначале и в конце.
// Разбить строку по пробелам на массив.
// Вывести массив.
public class Task3 {
    public static void main(String[] args) {
        String str = "      Привет. Как дела?      ";
        System.out.println(str);
        System.out.println(str.trim());

        String str1 = str.trim();
        String[] worlds = str1.split(" ");
        for (String word : worlds) {
            System.out.println(word);
        }
    }
}
