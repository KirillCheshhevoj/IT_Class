package Lesson_17_18_19._01_generic;

public class GenericBox<T> {
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T doSmth() {
        return value;
    }
}
