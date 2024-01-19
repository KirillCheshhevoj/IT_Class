package Lesson_11.Task4.model;

public enum Color {
    BLACK,
    BLUE,
    GREY,
    RED,
    WHITE;

    public static Color getColorByIndex(int index) {
        Color[] colors = Color.values();
        return colors[index];
    }
}
