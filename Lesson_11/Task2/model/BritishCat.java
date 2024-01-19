package Lesson_11.Task2.model;

import Lesson_11.Task2.Interface.IPlay;

public class BritishCat extends Cat implements IPlay {
    public BritishCat() {
    }

    public BritishCat(String nickname, Color color) {
        super(nickname, color);
    }

    @Override
    public void play() {
        System.out.println("The british cat " + getNickname() + " is playing");
    }

    @Override
    public void voice() {
        System.out.println("The british cat " + getNickname() + " is meows");
    }

    @Override
    public void wag() {
        System.out.println("The british cat " + getNickname() + " is wagging its tail");
    }

    @Override
    public String toString() {
        return "Lesson_11.Task2.model.BritishCat{" +
                "nickname='" + getNickname() + '\'' +
                ", color=" + getColor() +
                "} " + super.toString();
    }
}
