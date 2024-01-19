package Lesson_11.Task2.model;

import Lesson_11.Task2.Interface.IPlay;
import Lesson_11.Task2.Interface.ISwim;

public class NorwayCat extends Cat implements IPlay, ISwim {
    public NorwayCat() {
    }

    public NorwayCat(String nickname, Color color) {
        super(nickname, color);
    }

    @Override
    public void play() {
        System.out.println("The norway cat " + getNickname() + " is playing");
    }

    @Override
    public void swim() {
        System.out.println("The norway cat " + getNickname() + " is swimming");
    }

    @Override
    public void voice() {
        System.out.println("The norway cat " + getNickname() + " is meows");
    }

    @Override
    public void wag() {
        System.out.println("The norway cat " + getNickname() + " is wagging its tail");
    }

    @Override
    public String toString() {
        return "NorwayCat{" +
                "nickname='" + getNickname() + '\'' +
                ", color=" + getColor() +
                "} " + super.toString();
    }
}
