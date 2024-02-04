package Lesson_27_xml_json._01_txt.exceptions;

import lombok.Getter;

public class TxtException extends Exception {
    @Getter
    private String errLine;

    public TxtException(String message, Throwable cause) {
        super(message, cause);
        this.errLine = errLine;
    }

    @Override
    public String toString() {
        return "TxtException{" +
                "errLine='" + errLine + '\'' +
                '}';
    }
}

