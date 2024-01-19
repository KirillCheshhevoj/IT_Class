package Lesson_16.model.people;

import java.util.Arrays;

public class MyArrayList<T> {
    private final int INITIAL_SIZE = 2;
    private Object[] objectList = new Object[INITIAL_SIZE];
    private int currentIndex = 0;

    public void add(T object) {
        if (object != null) {
            if (currentIndex == objectList.length) {
                objectList = Arrays.copyOf(objectList, objectList.length * 3 / 2 + 1);
            }
            objectList[currentIndex++] = object;
        }
    }

    public T getByIndex(int index) {
        Object object = null;
        if (index > 0 && index < currentIndex) {
            object = objectList[index];
        }
        return (T) object;
    }

    public void show() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(objectList[i]);
        }
    }
}
