package Lesson_6.model;

public class Student extends Person{
    private double avg;

    public Student(String name, int age, double avg) {
        super(name, age);
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "avg=" + avg +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
