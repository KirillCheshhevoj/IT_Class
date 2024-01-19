package Lesson_17_18_19._01_generic;

public class ClassNameWriter {
    public <T> void writeClassName(T someObj) {
        System.out.println(someObj.getClass().getSimpleName());
    }

    public <T> T returnIbj(T someObj) {
        return someObj;
    }
}
