package Lesson_5.HomeTask.Task_2;

public abstract class Employee {
    protected static double cashSalary = 500.0;
    protected static final double COEFFICIENT = 100;
    private static final int FIRST_EXPERIENCE = 5;
    private static final int SECOND_EXPERIENCE = 15;
    private static final double BONUS_1 = 20.0;
    private static final double BONUS_2 = 40.0;
    private String name;
    private int experience;

    public Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getExperience() { return experience; }

    protected abstract double getContractAward();

    protected double getSeniorityAward() {
        double result = 0.0;
        if (experience >= SECOND_EXPERIENCE) {
            result = (cashSalary / COEFFICIENT) * BONUS_2;
        } else {
            if (experience >= FIRST_EXPERIENCE) {
                result = (cashSalary / COEFFICIENT) * BONUS_1;
            }
        }
        return result;
    }

    protected double getSalary() {
        double result = 0.0;
        result = cashSalary + getContractAward() + getSeniorityAward();
        return result;
    }

    public static void setCashSalary(double value) {
        cashSalary = value;
    }
}
