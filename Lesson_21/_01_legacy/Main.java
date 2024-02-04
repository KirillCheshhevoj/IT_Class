package Lesson_21._01_legacy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now.getTime());
        Date someDateAfter70 = new Date(1l);
        System.out.println(someDateAfter70);
        Date someDateBefore70 = new Date(-1672587l);
        System.out.println(someDateAfter70);

        java.sql.Date sqlNow = new java.sql.Date(1687367966656l);
//        java.sql.Date sqlDateBefore70 = new java.sql.Date(1687367966656l);
        System.out.println(someDateAfter70.before(sqlNow));

        Calendar calendarNow = Calendar.getInstance();
        System.out.println(calendarNow);
        calendarNow.set(2, 2);
        System.out.println(calendarNow);
        calendarNow.add(Calendar.MONTH, -7);
        System.out.println(calendarNow.getTimeInMillis());
        SimpleDateFormat format = new SimpleDateFormat();
        System.out.println(format.format(now));

        String pattern = "G dd-MMMM-yy      HH:mm:ss S";
//        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        format.applyPattern(pattern);
        System.out.println(format.format(now));
    }
}
