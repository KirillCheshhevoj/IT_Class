package Lesson_17_18_19._02_collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List arrList = new ArrayList();

        Date now = new Date();
        long timeBefore = now.getTime();

        int[] indexes = {1, 2, 5};
        for (int i : indexes) {
            arrList.get(i);
        }

        now = new Date();
        long timeAfter = now.getTime();
        System.out.println("" + (timeAfter - timeBefore));
//        arrList.add(String.valueof(1));
//        arrList.add("qqq");
//        arrList.remove(1);
//        arrList.remove(Integer.valueOf(1));
//        System.out.println();

//        arrList.add(Dog);
//        arrList.add(Cat);

        List<Integer> list = Arrays.asList(1, 2, 3);
        Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        List<String> strList = new ArrayList<>();
        strList.iterator().next();
    }
}
