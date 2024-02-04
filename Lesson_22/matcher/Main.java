package Lesson_22.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("best");
//        Matcher matcher = pattern.matcher("Java is a best language");
//        System.out.println(matcher.lookingAt());
//        System.out.println(matcher.find());
//        System.out.println(matcher.find(20));
//        matcher.usePattern(Pattern.compile("grt"));
//        System.out.println(matcher.find());
//        matcher.reset();
//        String str = "John Johnson Franc Erickson";
//        Pattern pattern = Pattern.compile("John.*\\b");
//        Matcher matcher = pattern.matcher(str);
//
//        String replacedString = matcher.replaceAll("Eric");
//        System.out.println(replacedString);
//
//        pattern = Pattern.compile("John.*?\\b");
//        matcher = pattern.matcher(str);
//        replacedString = matcher.replaceAll("Eric");
//        System.out.println(replacedString);
//
//        pattern = Pattern.compile("John");
//        matcher = pattern.matcher(str);
//        replacedString = matcher.replaceAll("Eric");
//        System.out.println(replacedString);
//
//        pattern = Pattern.compile("John\\w*");
//        matcher = pattern.matcher("java .net javascript");
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }
//
//        str = "http://yandex.ru.1258.html, http://yandex.ru.2458.html";
//        pattern = Pattern.compile("http://([a-z\\.]*)(\\d+).html");
//        matcher = pattern.matcher(str);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }

        String str = "Java Angular Javascripta";
        Pattern pattern = Pattern.compile("A.*a");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}
