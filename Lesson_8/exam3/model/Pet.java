package Lesson_8.exam3.model;

public abstract class Pet {
    private String nickname;

    public Pet() {
    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public abstract void wagTail();
}
