package Lesson_10.model;

public class Person1 implements Comparable<Person1>, Cloneable {
    private String name;
    private String country;
    private int birthYear;

    public Person1() {
    }

    public Person1(String name, String country, int birthYear) {
        this.name = name;
        this.country = country;
        this.birthYear = birthYear;
    }

    // натуральны парадак сартавання па гадах нараджэння
    /*
    @Override
    public int compareTo(Person1 person1) {
        // можна праз if

        if (birthYear > person1.birthYear) {
            return 1;
        } else if (birthYear < person1.birthYear) {
            return -1;
        } else {
            return 0;
        }


        // можна праз метад compare
        // return Integer.compare(birthYear, person1.birthYear);
        return birthYear - person1.birthYear;
    }
    */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public int compareTo(Person1 person1) {
        if (name.compareTo(person1.name) != 0)
            return name.compareTo(person1.name);
        if (country.compareTo(person1.country) != 0)
            return country.compareTo(person1.country);
        return birthYear - person1.birthYear;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Lesson_10.model.Person1{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
