package Lesson_11.Task2.model;

import Lesson_11.Task2.Interface.ISwim;
import Lesson_11.Task2.Interface.IWag;

public class Fish extends Pet implements IWag, ISwim {
    public Fish() {
    }

    public Fish(String nickname, Color color) {
        super(nickname, color);
    }

    @Override
    public void eat() {
        System.out.println("The fish " + getNickname() + " is eating");
    }

    @Override
    public void wag() {
        System.out.println("The fish " + getNickname() + " is wagging its tail");
    }

    @Override
    public void swim() {
        System.out.println("The fish " + getNickname() + " is swimming");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "nickname='" + getNickname() + '\'' +
                ", color=" + getColor() +
                "} " + super.toString();
    }
}
