package Lesson_11.Task2.model;

import Lesson_11.Task2.Interface.IVoice;

// калі класс рыалізает інтэрфейс, но не перавызначае хоць бы
// адзін яго абстрактны метад, тады такі класс таксама патрэбен быць
// абстрактным
public abstract class Cat extends Pet implements IVoice {
    public Cat() {
    }

    public Cat(String nickname, Color color) {
        super(nickname, color);
    }

    @Override
    public void eat() {
        System.out.println("The cat " + getNickname() + " is eating");
    }


}
