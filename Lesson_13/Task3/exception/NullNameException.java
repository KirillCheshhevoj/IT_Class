package Lesson_13.Task3.exception;

public class NullNameException extends IllegalArgumentException {
    public NullNameException() {
    }

    public NullNameException(String message) {
        super(message);
    }

    public NullNameException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return "NullNameException{" +
                "message='" + getMessage() + '\'' +
                '}';
    }
}