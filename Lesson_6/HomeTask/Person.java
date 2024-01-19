package Lesson_6.HomeTask;

public abstract class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getMonthlyIncome();

    public static double getAverageMonthlyIncome(Person[] people) {
        double avgInc = 0.0;
        for (int i = 0; i < people.length; i++) {
            avgInc += people[i].getMonthlyIncome();
        }
        return (avgInc / people.length);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (!(obj instanceof Person))//если объект не является объектом класса Person
            return false;

        Person person = (Person) obj;
        double exp = 0.01;//с такой заданной точностью будем сравнивать
        return (Math.abs(getMonthlyIncome() - person.getMonthlyIncome()) < exp);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
