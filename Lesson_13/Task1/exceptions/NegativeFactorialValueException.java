package Lesson_13.Task1.exceptions;

public class NegativeFactorialValueException extends Exception{
    private int value;

    public NegativeFactorialValueException() {
    }

    public NegativeFactorialValueException(int value) {
        this.value = value;
    }

    public NegativeFactorialValueException(String message) {
        super(message);
    }

    public NegativeFactorialValueException(String message, int value) {
        super(message);
        this.value = value;
    }

    @Override
    public String toString() {
        return "Lesson_13.Task1.exceptions.NegativeFactorialValueException{" +
                "value=" + value +
                ", message='" + getMessage() + '\'' +
                "} " + super.toString();
    }
}
