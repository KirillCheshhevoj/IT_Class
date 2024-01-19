package Lesson_16.model;

public class Huskey extends Dog {
    public Huskey(String nickname) {
        super(nickname);
    }

    public void destroy() {
        System.out.println(getNickname() + " is destroy");
    }

    @Override
    public String toString() {
        return "Huskey{" +
                "nickname='" + getNickname() + '\'' +
                "} ";
    }
}
