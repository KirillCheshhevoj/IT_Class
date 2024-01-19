 package Lesson_16.model;

public class Dog extends Pet{
    public Dog(String nickname) {
        super(nickname);
    }

    public void guard() {
        System.out.println(getNickname() + " is guards");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + getNickname() + '\'' +
                "} ";
    }
}
