package Lesson_13.Task3.exception;

public class IncorrectAvgPointException extends IllegalArgumentException{
    public IncorrectAvgPointException() {
    }

    public IncorrectAvgPointException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "IncorrectAvgPointException{" +
                "localizedMessage='" + getLocalizedMessage() + '\'' +
                '}';
    }
}