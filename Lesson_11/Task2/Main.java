package Lesson_11.Task2;

import Lesson_11.Task2.Interface.ISwim;
import Lesson_11.Task2.Interface.IVoice;
import Lesson_11.Task2.model.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // можна створываць спасылкі тыпа інтэрфейса. У такіх спасылках можна
        // храніць толькі аб'екты классаў, які рыалізуюць гэты інтэрфейс
        // ISwim iSwim1 = new BritishCat(); не суадносіцца з гэтым тыпам
        ISwim iSwim2 = new Fish("Karas", Color.RED);
        ISwim iSwim3 = new NorwayCat("Mrzik", Color.COLORFUL);

        // можна створываць масівы тыпа інтэрфейса і захоўвываць там аб'екты
        // классаў, які рыалізуюць гэты інтэрфейс
        ISwim[] iSwims = {
                iSwim2,
                iSwim3
        };

        // аднак праз пераменныя інтэрфейса бачна кантэкст толькі
        // гэтага інтэрфейса і метады класса Object
        iSwim2.swim();

        for (ISwim iSwim : iSwims) {
            System.out.println(iSwim);
        }

        System.out.println("----------------------");
        Pet[] pets = {
                new Fish("Karas", Color.RED),
                new NorwayCat("Mrzik", Color.COLORFUL),
                new BritishCat("Snezhok", Color.BLACK),
                new MaineCoon("Grob", Color.WHITE),
                new Dog("Rex", Color.COLORFUL)
        };

        // праз пераменныя тіпа класса можна пабачыць кантэкст гэтага класса
        // яго суперклассаў і інтэрфейсаў, які гэты класс рыалізуюць
        for (Pet pet : pets) {
            System.out.println(pet);
            pet.eat();
        }

        System.out.println("----------------------");
        IVoice[] iVoices = new IVoice[pets.length];
        int index = 0;
        for (Pet pet : pets) {
            // праверка на прыналежнасці аб'екта да тыпу інтэрфейсу
            // (ці рэалізуе клас да якога належыць бягучы аб'ект
            // паказаны інтэрфейс)
            if (pet instanceof IVoice) {
                iVoices[index++] = (IVoice) pet;
            }
        }
        // у нашай задачы індэкс пасля цыкла роўны кол-ці жывёл
        // якія ўмеюць выдаваць гук
        iVoices = Arrays.copyOf(iVoices, index);
        for (IVoice iVoice : iVoices) {
            iVoice.voice();
        }

        System.out.println("How only cats eat");
        for (Pet pet : pets) {
            if (pet instanceof Cat) {
                pet.eat();
            }
        }

        System.out.println("---How only fish swim");
        for (Pet pet : pets) {
            if (pet instanceof Fish) {//if(pet instanceof Fish fish){
                ((Fish) pet).swim();// fish.swim()
            }
        }

        System.out.println("--Cats that can swim");
        for (Pet pet : pets) {
            if (pet instanceof Cat && pet instanceof ISwim) {
                ((ISwim) pet).swim();
            }
        }

        System.out.println("How do cats that can swim: ");
        for (Pet pet : pets) {
            if (pet instanceof Cat && pet instanceof ISwim swim) {
                swim.swim();
            }
        }

        System.out.println("The most common color among all pets: ");
        int[] colors = new int[Color.values().length];
        int maxRatingColor = 0;
        int indexColor = -1;

        for (int i = 0; i < pets.length; i++) {
            colors[pets[i].getColor().ordinal()]++;
        }

        for (int i = 0; i < colors.length; i++) {
            if (colors[i] >= maxRatingColor) {
                maxRatingColor = colors[i];
                indexColor = i;
            }
        }
        System.out.println(Color.getColorByIndex(indexColor));

        System.out.println("The most common color among cats");
        colors = new int[]{0, 0, 0, 0};
        maxRatingColor = 0;
        indexColor = -1;

        for (int i = 0; i < pets.length; i++) {
            if (pets[i] instanceof Cat) {
                colors[pets[i].getColor().ordinal()]++;
            }

        }

        for (int i = 0; i < colors.length; i++) {
            if (colors[i] >= maxRatingColor) {
                maxRatingColor = colors[i];
                indexColor = i;
            }
        }
        System.out.println(Color.getColorByIndex(indexColor));

    }
}


