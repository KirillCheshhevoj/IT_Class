package Lesson_4.model;

public class Animal {
    // ініцыялізацыя можна, без канструктараў
    // але толькі для палей final
    // адпрацуе першым, чым канструктар
    private static int counterID;
    private int id;
    private String nickname = "none";
    private int age = 0;

    // static блокі кода
    // выкарыстоўваюцца толькі адзін раз пры прагрузкі класа ў памяць
    static {
        System.out.println("class Animal loading");
        counterID = 0;
    }

    // блок кода (метад бяз імя); выклікаецца пры кожнам створэнні аб'екту
    {
        System.out.println("Create Animal");
        id = ++counterID;
    }

    public Animal() {
        nickname = "none constructor";
        age = 5;
    }

    public Animal(String nickname, int age) {
        this.nickname = nickname;
        setAge(age);
    }

    public void setAge(int age) {
        this.age = age >= 0 ? age : 0;
    }
     // static метады можа выклікаць праз імя класса
    public static int getCounterID() {
        // this в статычных метадах недаступен,
        // метад не выклікаецца аб'ектам
        return counterID;
    }

    public void info() {
        System.out.println("ID: " + id +
                ", nickname: " + nickname +
                ", age " + age);
    }
}
