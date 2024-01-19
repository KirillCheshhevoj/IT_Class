package Lesson_15.Task5.model;

public class Student extends Person{
    private double avg;

    public Student() {
    }

    public Student(String name, int age, double avg) {
        super(name, age);
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String fieldsToFileLine() {
        return super.fieldsToFileLine() + " " + avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", avg=" + avg +
                "} ";
    }
}
