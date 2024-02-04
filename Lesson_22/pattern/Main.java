package Lesson_22.pattern;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "java1.net5javascript";
//        System.out.println(str.matches("\\d{6}"));
        // ^ $ \b \B
        // \d \D \w \W \s \S
        // \t \n \r \f
        // [asd] [^asd] [a-zA-Z] [a-d[s-v]]
        // ? * + {n} {n,}
//        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
//
//        System.out.println(pattern.pattern());

//        Pattern pattern1 = Pattern.compile("\\s", 15);
//        String[] strings = pattern1.split(str, 5);
//        System.out.println(Arrays.toString(strings));

        System.out.println(Pattern.matches("Java", "Java is a language"));
        System.out.println(Pattern.matches("Java", "Java"));
    }
}
