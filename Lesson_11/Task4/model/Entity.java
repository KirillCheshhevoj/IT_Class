package Lesson_11.Task4.model;

import Lesson_11.Task4.interfaces.IOwner;

public class Entity implements IOwner {
    private String payersRegistrationNumber;
    private String nameCompany;

    public Entity(String nameCompany, String payersRegistrationNumber) {
        this.payersRegistrationNumber = payersRegistrationNumber;
        this.nameCompany = nameCompany;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entity entity = (Entity) o;

        if (payersRegistrationNumber != null ? !payersRegistrationNumber.equals(entity.payersRegistrationNumber) : entity.payersRegistrationNumber != null)
            return false;
        return nameCompany != null ? nameCompany.equals(entity.nameCompany) : entity.nameCompany == null;
    }

    @Override
    public int hashCode() {
        int result = payersRegistrationNumber != null ? payersRegistrationNumber.hashCode() : 0;
        result = 31 * result + (nameCompany != null ? nameCompany.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "payersRegistrationNumber='" + payersRegistrationNumber + '\'' +
                ", nameCompany='" + nameCompany + '\'' +
                '}';
    }

    @Override
    public String getOwnerNumber() {
        return payersRegistrationNumber;
    }

    @Override
    public String getOwnerName() {
        return nameCompany;
    }
}

