package Lesson_6.HomeTask;
public class Student extends Person {
    private static final double AVG_GOOD = 6.0;
    private static final double AVG_SUPERB = 8.0;
    private static final double PRIZE_GOOD = 80.0;
    private static final double PRIZE_SUPERB = 150.0;
    private double avg;
    private double parentsMoney;

    public Student() {
    }

    public Student(String name, double avg, double parentsMoney) {
        super(name);
        this.avg = avg;
        this.parentsMoney = parentsMoney;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public double getParentsMoney() {
        return parentsMoney;
    }

    public void setParentsMoney(double parentsMoney) {
        this.parentsMoney = parentsMoney;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", avg=" + avg +
                ", parentsMoney=" + parentsMoney +
                ", monthlyIncome=" + getMonthlyIncome() +
                '}';
    }

    @Override
    public double getMonthlyIncome() {
        double sum = parentsMoney;
        double grant = 0.0;
        if (avg > AVG_SUPERB) {
            grant = PRIZE_SUPERB;
        } else if (avg > AVG_GOOD) {
            grant = PRIZE_GOOD;
        }
        return (parentsMoney + grant);
    }
}
