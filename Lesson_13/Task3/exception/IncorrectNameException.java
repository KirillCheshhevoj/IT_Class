package Lesson_13.Task3.exception;

public class IncorrectNameException extends IllegalArgumentException{
    public IncorrectNameException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "IncorrectNameException{" +
                "message='" + getMessage() + '\'' +
                '}';
    }
}