package Lesson_11.Task2.model;

import Lesson_11.Task2.Interface.IPlay;
import Lesson_11.Task2.Interface.ISwim;
import Lesson_11.Task2.Interface.IVoice;

public class Dog extends Pet implements IPlay, IVoice, ISwim {
    public Dog() {
    }

    public Dog(String nickname, Color color) {
        super(nickname, color);
    }

    @Override
    public void play() {
        System.out.println("The dog " + getNickname() + " is playing");
    }

    @Override
    public void swim() {
        System.out.println("The dog " + getNickname() + " is swimming");
    }

    @Override
    public void voice() {
        System.out.println("The dog " + getNickname() + " is barking");
    }

    @Override
    public void wag() {
        System.out.println("The dog " + getNickname() + " is wagging its tail");
    }

    @Override
    public void eat() {
        System.out.println("The dog " + getNickname() + " is eating");
    }
}
