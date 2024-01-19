package Lesson_11.Task2.model;

public enum Color {
    BLACK,
    WHITE,
    RED,
    COLORFUL;

    public static Color getColorByIndex(int index) {
        Color[] colors = Color.values();
        return colors[index];
    }
}
