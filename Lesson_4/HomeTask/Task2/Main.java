package Lesson_4.HomeTask.Task2;

// Разработать класс, для хранения информации о пользователе: имя пользователя и
// год рождения. Создать в классе метод, вычисляющий возраст пользователя в
// заданном году.
// Дополнить класс пользователя из предыдущей задачи информацией месяце
//рождения (месяц и год хранить в виде целых типов). Создать метод, вычисляющий
//возраст человека в месяцах, а также методы возвращающие количество полных лет
//и количество полных месяцев прошедших с дня рождения (0 - 11).

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User("Kirill", 1998);
        user1.info();
        user2.info();

        User1 person = new User1("Sasha", 1994, 3);
        User1[] people = new User1[10];
        int currentYear = 2023;
        int currentMonth = 4;
        System.out.println("Age user: " + person.getNameUser() + ", in " + currentYear + " year = " + person.ageYears(currentYear));
        System.out.println("Age in month: " + person.ageMonths(currentYear, currentMonth));
        System.out.println("Full years: " + person.fullYears(currentYear, currentMonth));
        System.out.println("Full month: " + person.fullMonths(currentMonth));
    }
}

