package Lesson_11.Task1.model;

public class Saxophone implements AbleToInstrument{
    @Override
    public void sound() {
        System.out.println("Звучит саксофон");
    }
}
