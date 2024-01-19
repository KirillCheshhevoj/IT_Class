package Lesson_9.exam4;

import Lesson_9.exam4.model.*;

public class Main {
    public static void main(String[] args) {
        Producer[] producers = {
                new Producer("Sokolov"),
                new Producer("7KARAT"),
                new Producer("SLAVIA")
        };

        Jewellery[] jewelleries = {
                new Ring(1, 5.5, Material.WHITE_GOLD, producers[0], 17),
                new Earrings(2, 10, Material.SILVER, producers[1]),
                new Necklace(3, 20, Material.GOLD, producers[2])
        };

        for (Jewellery jewellery : jewelleries) {
            System.out.println(jewellery);
        }

        Ring ring1 = new Ring(5, 17, Material.GOLD, producers[2], 20);
        Ring ring2 = ring1;

        System.out.println(ring1);
        System.out.println(ring2);
        ring1.getProducer().setName("SAKALOV");
        System.out.println(ring1);
        System.out.println(ring2);

    }
}
