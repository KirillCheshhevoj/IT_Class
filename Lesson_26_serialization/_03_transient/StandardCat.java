package Lesson_26_serialization._03_transient;

import java.io.Serializable;

public class StandardCat implements Serializable {
    static final long serialVersionUID = 1L;

    static String STATIC_FIELD = "static";
    final String name;
    transient StandardBox box;

    public StandardCat(String name, StandardBox box) {
        this.name = name;
        this.box = box;
    }

    @Override
    public String toString() {
        return "StandardCat{" +
                "static=' " + STATIC_FIELD + '\'' +
                "name='" + name + '\'' +
                ", box=" + box +
                '}';
    }
}
