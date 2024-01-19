package Lesson_6.HomeTask;

public class Employee extends Person {
    public static final double TAX = 0.135;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", salary=" + salary +
                ", monthlyIncome=" + getMonthlyIncome() +
                '}';
    }

    @Override
    public double getMonthlyIncome() {
        double income = 0.0;
        income = salary - salary * TAX;
        return income;
    }
}
