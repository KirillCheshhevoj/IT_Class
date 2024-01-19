package Lesson_13.Task3.exception;

public class CreateStudentException extends Exception {
    public CreateStudentException() {
    }

    public CreateStudentException(String message) {
        super(message);
    }

    public CreateStudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreateStudentException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return "CreateStudentException{" +
                "message='" + getMessage() + '\'' +
                ", cause=" + getCause() +
                '}';
    }
}
