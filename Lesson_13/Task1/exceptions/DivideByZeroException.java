package Lesson_13.Task1.exceptions;

public class DivideByZeroException extends Exception{
    public DivideByZeroException() {
    }

    public DivideByZeroException(String message) {
        super(message);
    }

}
