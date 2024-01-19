package Lesson_4.HomeTask.Task2;

public class User {
    private String nameUser;
    private int year;

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

    public User(String nameUser, int age) {
        this.nameUser = nameUser;
        this.year = age;
    }

    public User() {
        nameUser = "none name";
        year = 0;
    }

    private int getNowAge() {
        return 2023 - getAge();
    }
    public void info() {
        System.out.println("Username: " + nameUser +
                ", age: " + getNowAge());
    }
}
