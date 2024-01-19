package Lesson_9.exam2;

import Lesson_9.exam2.model.AbstractDiscount;
import Lesson_9.exam2.model.Discount;

public class Main {
    public static void main(String[] args) {
        for (Discount dis : Discount.values()) {
            System.out.println(dis.getDiscount());
        }

        Discount.DISCOUNTED.setDiscount(0.85);
        System.out.println("-----------------------");
        for (Discount dis : Discount.values()) {
            System.out.println(dis);
        }

        // выклік статычнага метаду з пералічэння
        Discount.method();

        System.out.println("-----------------------");

        for (AbstractDiscount ad : AbstractDiscount.values()) {
            System.out.println(ad.discount());
        }

        // AbstractDiscount.UNDISCOUNTED.discount();
    }
}
