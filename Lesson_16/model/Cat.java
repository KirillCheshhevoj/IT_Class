package Lesson_16.model;

public class Cat extends Pet {
    public Cat(String nickname) {
        super(nickname);
    }

    public void sleep() {
        System.out.println(getNickname() + " is sleeping");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nickname='" + getNickname() + '\'' +
                "} " + super.toString();
    }
}
