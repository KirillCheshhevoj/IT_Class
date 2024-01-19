package Lesson_9.exam5;

import Lesson_9.exam5.model.*;

public class Main {
    public static void main(String[] args) {
        final int AMOUNT = 9;
        int numberOfCrockery = 0;
        double summ = 0.0;
        double averageValue = 0.0;

        Crockery[] crockeries = new Crockery[AMOUNT];
        crockeries[0] = new Pan(123, 3, Material.ALUMINUM);
        crockeries[1] = new Pan(454, 2, Material.CAST_IRON);
        crockeries[2] = new Caserole(789, 1.5, Material.STEEL);
        crockeries[3] = new Caserole(987, 2.5, Material.ALUMINUM);
        crockeries[4] = new Plate(654, 0.2, Material.PARCELAIN);
        crockeries[5] = new Plate(321, 0.5, Material.ALUMINUM);
        crockeries[6] = new Pan(crockeries[0]);
        crockeries[6].setArticle(1125);
        crockeries[7] = new Caserole(crockeries[2]);
        crockeries[7].setArticle(7794);
        crockeries[8] = new Plate(crockeries[4]);
        crockeries[8].setArticle(6471);

        for (Crockery crockery : crockeries) {
            System.out.println(crockery);
        }

        for (int i = 0; i < crockeries.length; i++) {
            if (crockeries[i] instanceof Pan) {
                numberOfCrockery++;
                summ += crockeries[i].getCost();
            }
        }
        averageValue = summ / numberOfCrockery;
        numberOfCrockery = 0;
        summ = 0.0;

        System.out.printf("Средняя стоимость всех сковородок = %.2f руб.%n", averageValue);

        for (int i = 0; i < crockeries.length; i++) {
            if (crockeries[i] instanceof Caserole) {
                numberOfCrockery++;
                summ += crockeries[i].getVolume();
            }
        }
        averageValue = summ / numberOfCrockery;
        System.out.printf("Средний объём всех кастрюль = %.2f л.%n", averageValue);

        System.out.println("Ищем посуду равную по объему и стоимости, первой в массиве ->" + crockeries[0]);
        for (int i = 1; i < crockeries.length; i++) {
            if (crockeries[i].equals(crockeries[0])) {
                System.out.println("Посуда равная по объёму и стоимости");
                System.out.println(crockeries[i]);
            }
        }
    }
}
