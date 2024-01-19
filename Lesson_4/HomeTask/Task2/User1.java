package Lesson_4.HomeTask.Task2;

public class User1 {
    private static int MONTH_PER_YEAR = 12;
    private String nameUser;
    private int year;
    private int month;

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public int getAge() {
        return year;
    }

    public void setAge(int age) {
        this.year = age;
    }

    public User1() {
    }

    public User1(String nameUser, int year, int month) {
        this.nameUser = nameUser;
        this.year = year;
        this.month = month;
    }

    public int ageYears(int currentYear) {
        return currentYear - year;
    }

    public int ageMonths(int currentYear, int currentMonth) {
        return (fullYears(currentYear, currentMonth) * MONTH_PER_YEAR) + fullMonths(currentMonth);
    }

    public int fullYears(int currentYear, int currentMonth) {
        int incomplete = 1;
        return (currentMonth < month) ? currentYear - year - incomplete : currentYear - year;
    }

    public int fullMonths(int currentMonth) {
        if (currentMonth >= month) {
            return (currentMonth - month);
        } else {
            return (MONTH_PER_YEAR - (month - currentMonth));
        }
    }
}
