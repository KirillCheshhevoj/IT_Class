package Lesson_5.model;

public class Student extends Person {
    private String university;
    private double avg;

    public Student() {
        // super(); - калі канструктар пусты, тады аўтаматычна
        // выклікаецца канструктар безумоўна базавага класса пры
        // дапамазе канструкцыі super();
        this("None", 1, "GSTU", 2);
    }

    public Student(String name, int age, String university, double avg) {
        super(name, age); // Person(String name, int age);
        this.university = university;
        this.avg = avg;
    }

    public Student(String university, double avg) {
        // super();
        this.university = university;
        this.avg = avg;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String info() {
        String studentInfo = "[Student]Name: " + getName() +
                ", age: " + getAge() +
                ", university: " + university +
                ", mark: " + avg;
        return studentInfo;
    }

    public void greeting(String name, int age, String university) {
        System.out.println("Hi Student");
    }

    @Override
    public void greeting() {
        System.out.println("  Hi !!!!!");
        ;
    }

    @Override
    public Person createClone() {
        return new Student(getName(), getAge(), university, avg);
    }

    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", avg=" + avg +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
