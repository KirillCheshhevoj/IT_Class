package Lesson_13.Task3.exception;

public class NegativeAvgPointException extends IllegalArgumentException {
    public NegativeAvgPointException() {
    }

    public NegativeAvgPointException(String message) {
        super(message);
    }

    public NegativeAvgPointException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return "NegativeAvgPointException{" +
                "localizedMessage='" + getLocalizedMessage() + '\'' +
                '}';
    }
}
