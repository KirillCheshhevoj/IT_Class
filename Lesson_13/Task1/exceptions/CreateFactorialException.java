package Lesson_13.Task1.exceptions;

public class CreateFactorialException extends Exception{
    public CreateFactorialException() {
    }

    public CreateFactorialException(Throwable cause) {
        super(cause);
    }

    public CreateFactorialException(String message, Throwable cause) {
        super(message, cause);
    }


}
