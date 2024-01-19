package Lesson_3;

import Lesson_3.by_itclass.model.Animal;

public class Main4 {
    public static void main(String[] args) {
        Object[] objects = new Object[5];
        objects[0] = new Animal();
        objects[1] = "Ivan";
        objects[2] = 300; // autoboxing new Integer(10)
        Integer v1 = 128; // boxing
        int x = 0;

        System.out.println(v1.intValue()); // unboxing
        x = v1; // autoboxing

        Integer v2 = 128;
        System.out.println(v1 == v2);

        v1++; // спачатку аўтараспакоўка палучылі int 6
        // інкрымент int палучылі 7
        // аўтаўпоўка 7 на новы аб'ект не створаецца, а вяртаецца адрэс
        // на створанны аб'ект з пула

    }
}
