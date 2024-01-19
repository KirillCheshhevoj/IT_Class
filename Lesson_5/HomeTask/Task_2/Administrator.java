package Lesson_5.HomeTask.Task_2;

public class Administrator extends Employee{
    private static double percent = 20.0;
    public Administrator(String name, int experience) {
        super(name, experience);
    }

    @Override
    protected double getContractAward(){
        double award = (cashSalary / COEFFICIENT) * percent;
        return award;
    }

    @Override
    public String toString() {
        return "Administrator {" +
                "name='" + getName() + '\'' +
                ", experience=" + getExperience() +
                ", salary=" + getSalary() +
                '}';
    }
}
