package Lesson_5.HomeTask.Task_2;

public class Developer extends Employee {
    private static double percent = 200.0;
    public Developer(String name, int experience) {
        super(name, experience);
    }

    @Override
    protected double getContractAward(){
        double award = (cashSalary / COEFFICIENT) * percent;
        return award;
    }

    @Override
    public String toString() {
        return "Developer {" +
                "name='" + getName() + '\'' +
                ", experience=" + getExperience() +
                ", salary=" + getSalary() +
                '}';
    }
}
