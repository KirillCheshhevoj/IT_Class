package Lesson_26_serialization._03_transient;

import java.io.Serializable;
import java.util.List;

public class StandardBox implements Serializable {
    List<String> toys;

    public StandardBox(List<String> toys) {
        this.toys = toys;
    }

    @Override
    public String toString() {
        return "StandardBox{" +
                "toys=" + toys +
                '}';
    }
}
