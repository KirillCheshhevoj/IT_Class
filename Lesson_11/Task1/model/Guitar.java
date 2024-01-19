package Lesson_11.Task1.model;

public class Guitar implements AbleToInstrument{
    @Override
    public void sound() {
        System.out.println("Звучит гитара");
    }
}
