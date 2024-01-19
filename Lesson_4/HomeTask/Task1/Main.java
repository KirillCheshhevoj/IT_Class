package Lesson_4.HomeTask.Task1;

// Разработать класс пользователь, содержащий поля логин, пароль и год
// рождения. Создать конструктор с параметрами и по умолчанию, геттеры и
// сеттеры, метод выводящий информацию. Создать два объекта класса
// пользователь и продемонстрировать работу созданных методов.

public class Main {
    public static void main(String[] args) {
        User[] users = new User[2];
        users[0] = new User();
        users[1] = new User("Priverma", "12345", 1998);


        for (User user : users) {
            System.out.println(user.getPassword());
            System.out.println(user.getLogin());
            System.out.println(user.getAge());
            user.info();
        }

        users[0].setLogin("ivanov@yandex.by");
        users[0].setPassword("1234");
        users[0].setAge(23);
        users[0].info();
    }
}
