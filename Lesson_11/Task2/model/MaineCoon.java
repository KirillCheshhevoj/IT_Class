package Lesson_11.Task2.model;

import Lesson_11.Task2.Interface.IPlay;
import Lesson_11.Task2.Interface.ISwim;

public class MaineCoon extends Cat implements IPlay, ISwim {
    public MaineCoon() {
    }

    public MaineCoon(String nickname, Color color) {
        super(nickname, color);
    }

    @Override
    public void play() {
        System.out.println("The MaineCoon " + getNickname() + " is playing");
    }

    @Override
    public void swim() {
        System.out.println("The MaineCoon " + getNickname() + " is swimming");
    }

    @Override
    public void voice() {
        System.out.println("The MaineCoon " + getNickname() + " is meows");
    }

    @Override
    public void wag() {
        System.out.println("The MaineCoon " + getNickname() + " is wagging its tail");
    }

    @Override
    public String toString() {
        return "Lesson_11.Task2.model.MaineCoon{" +
                "nickname='" + getNickname() + '\'' +
                ", color=" + getColor() +
                "} " + super.toString();
    }
}
