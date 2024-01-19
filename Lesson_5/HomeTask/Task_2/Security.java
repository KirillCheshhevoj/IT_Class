package Lesson_5.HomeTask.Task_2;

public class Security extends Employee {
    private static double percent = 10.0;
    public Security(String name, int experience) {
        super(name, experience);
    }

    @Override
    protected double getContractAward(){
        double award = (cashSalary / COEFFICIENT) * percent;
        return award;
    }

    @Override
    public String toString() {
        return "Security {" +
                "name='" + getName() + '\'' +
                ", experience=" + getExperience() +
                ", salary=" + getSalary() +
                '}';
    }
}
