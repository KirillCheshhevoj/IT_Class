package Lesson_11.Task1;

import Lesson_11.Task1.model.*;

public class Main {
    public static void main(String[] args) {
        AbleToInstrument[] instruments = {
                new Accordion(),
                new Flute(),
                new Guitar(),
                new Saxophone(),
                new Violin()
        };

        for (AbleToInstrument instrument : instruments) {
            instrument.sound();
        }
    }
}
