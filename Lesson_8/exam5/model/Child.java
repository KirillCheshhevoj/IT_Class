package Lesson_8.exam5.model;

public class Child {
    private String name;
    private int sweetsNumber;

    public Child() {
    }

    public Child(String name, int sweetsNumber) {
        this.name = name;
        this.sweetsNumber = sweetsNumber;
    }

    public void sleep() {
        // лакальны клас ствараецца і існуе толькі ўнутры метаду або блока кода
        class Sparrow {
            public void eatSweet() {
                while (sweetsNumber > 0) {
                    System.out.println("Chik Chirik");
                    sweetsNumber--;
                }
            }
        }

        Sparrow sparrow = new Sparrow();
        sparrow.eatSweet();
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", sweetsNumber=" + sweetsNumber +
                '}';
    }
}
