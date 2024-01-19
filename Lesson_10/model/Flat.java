package Lesson_10.model;

public class Flat implements Comparable<Flat>, Cloneable {
    private String address;
    private Person1 owner;

    public Flat() {
    }

    public Flat(String address, Person1 owner) {
        this.address = address;
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person1 getOwner() {
        return owner;
    }

    public void setOwner(Person1 owner) {
        this.owner = owner;
    }

    @Override
    public int compareTo(Flat flat) {
        if (address.compareToIgnoreCase(flat.address) != 0)
            return address.compareToIgnoreCase(flat.address);
        return owner.compareTo(flat.owner);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Flat cloneFlat = (Flat) super.clone();
        cloneFlat.owner = (Person1) owner.clone();
        // return ((Flat) super.clone()).owner = (Person1) owner.clone();
        return cloneFlat;
    }

    @Override
    public String toString() {
        return "Lesson_10.model.Flat{" +
                "address='" + address + '\'' +
                ", owner=" + owner +
                '}';
    }
}
