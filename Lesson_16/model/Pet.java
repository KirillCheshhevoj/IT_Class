package Lesson_16.model;

import java.util.Objects;

public class Pet {
    private String nickname;

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void eat() {
        System.out.println(nickname + " is eating");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        return Objects.equals(nickname, pet.nickname);
    }

    @Override
    public int hashCode() {
        return nickname != null ? nickname.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Lesson_16.model.Pet{" +
                "nickname='" + nickname + '\'' +
                '}';
    }
}
