package Lesson_3.by_itclass.model;

public class Animal {
    String name; // private package толькі ўнутры пакета
    private int age; // поле закрыта
    protected double weight;
    public String color; // адкрыта ўсюды

    public Animal() {
    }

    public Animal(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("Name: " + name +
                ", age: " + age +
                ", weight: " + weight +
                ", color: " + color);
    }
}

