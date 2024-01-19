package Lesson_16.HomeTask;

import Lesson_16.HomeTask.model.Calculate;

public class Task16 {
    public static void main(String[] args) {
        Calculate<Number> nObj = new Calculate<>(4, 3);
        Calculate<Float> fObj = new Calculate<>(2f, 3f);
        System.out.println(nObj.getSum());
        System.out.println(nObj.getDifference());
        System.out.println(fObj.getMultiplication());
        System.out.println(fObj.getDividing());
        System.out.println(Calculate.getDoubleCalculation(nObj));
        System.out.println(Calculate.getTripleCalculation(fObj));
    }
}
