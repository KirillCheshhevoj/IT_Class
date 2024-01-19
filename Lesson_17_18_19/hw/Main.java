package Lesson_17_18_19.hw;

import java.util.*;

public class Main {
    private static int collSize = 500000;
    private static int indexesSize = 5000;

    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        List<Integer> linList = new LinkedList<>();
        List<Integer> indexes = new ArrayList<>();
        Random rand = new Random();

        fillList(arrList, rand, collSize);
        fillList(linList, rand, collSize);
        fillList(indexes, rand, indexesSize);
        System.out.println("Read by index");
        System.out.println("ArrayList: " + readList(arrList, indexes));
        System.out.println("LinkList: " + readList(linList, indexes));
        System.out.println("Insert by index");
        System.out.println("ArrayList: " + insertList(arrList, indexes));
        System.out.println("LinkList: " + insertList(linList, indexes));
    }

    private static void fillList(List<Integer> list, Random rand, int size) {
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(collSize));
        }
    }

    private static long readList(List<Integer> list, List<Integer> indexes) {
        long start = new Date().getTime();
        for (Integer index : indexes) {
            list.get(index);
        }

        long finish = new Date().getTime();
        return finish - start;
    }

    private static long insertList(List<Integer> list, List<Integer> indexes) {
        long start = new Date().getTime();
        for (Integer index : indexes) {
            list.add(index, 10);
        }

        long finish = new Date().getTime();
        return finish - start;
    }
}
