package Lesson_8.exam6.model;

public class Employee {
    public static final double BONUS = 0.4;
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getGeneralSalary() {
        double sal = 0.0;
        sal = salary + salary * BONUS;
        return sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", generalSalary=" + getGeneralSalary() +
                '}';
    }
}
