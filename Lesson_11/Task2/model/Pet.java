package Lesson_11.Task2.model;

public abstract class Pet {
    private String nickname;
    private Color color;

    public Pet() {
    }

    public Pet(String nickname, Color color) {
        this.nickname = nickname;
        this.color = color;
    }

    public String getNickname() {
        return nickname;
    }

    public Color getColor() {
        return color;
    }

    public abstract void eat();
}
