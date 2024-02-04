package Lesson_26_serialization._02_standart;

import java.io.Serializable;

public class Child extends Parent implements Serializable {
    int childField;

    public Child(int childField) {
        System.out.println("Child constructor");
        this.childField = childField;
    }

    @Override
    public String toString() {
        return "Child{" +
                "parentField=" + parentField +
                ", childField=" + childField +
                '}';
    }
}
