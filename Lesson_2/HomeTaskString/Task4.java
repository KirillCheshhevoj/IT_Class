package Lesson_2.HomeTaskString;

// Разбить строку на массив по пробелам: «Василий съел мороженое и
// поправился на 20 грамм».
// Вывести общее количество символов в строке
// Элементы массива на нечетных местах привести в верхнему регистру.
public class Task4 {
    public static void main(String[] args) {
        int count = 0;
        String str = "Василий съел мороженое и поправился на 20 грамм";
        String[] words = str.split(" ");
        char[] strToArray = str.toCharArray();

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 1) {
            }
        }
    }
}
