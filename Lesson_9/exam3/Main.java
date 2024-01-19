package Lesson_9.exam3;

import Lesson_9.exam3.model.Rabbit;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Pushok", "Blue", "White", 7);
        Rabbit rabbitClone = new Rabbit(rabbit);
        System.out.println(rabbit);
        System.out.println(rabbitClone);
        rabbit.setWeight(10);
        System.out.println(rabbit);
        System.out.println(rabbitClone);
        System.out.println("Average weight: ");
        System.out.println(Rabbit.getAverageWeight(rabbit, rabbitClone));
    }
}
