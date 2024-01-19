package Lesson_17_18_19._02_queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Deque<String> stack = new ArrayDeque<>();
//        Deque<String> queue = new ArrayDeque<>();
//        stack.push("A");
//        stack.push("B");
//        stack.push("C");
//        stack.push("D");
//        System.out.println(stack);
//        while (!stack.isEmpty()) {
//            System.out.print(stack.pop() + " ");
//        }
//
//        System.out.println();
//        queue.add("A");
//        queue.add("B");
//        queue.add("C");
//        queue.add("D");
//        System.out.println(queue);
//
//        while (!queue.isEmpty()) {
//            System.out.print(queue.remove() + " ");
//        }

//        LinkedList<String> list = new LinkedList<>();
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        list.add("E");
//        list.addFirst("A");
//        list.addLast("F");
//        System.out.println(list);
//        list.remove("F");
//        list.remove(2);
//        list.removeFirst();
//        list.removeLast();
//        System.out.println(list);

        Queue<String> queue1 = new PriorityQueue<>();
        queue1.offer("A");
        queue1.offer("J");
        queue1.offer("E");
        queue1.offer("F");
        queue1.offer("B");
        while (queue1.size() > 0) {
            System.out.print(queue1.remove() + " ");
        }

        System.out.println();

        Queue<String> queue2 = new PriorityQueue<>(5, Collections.reverseOrder());
        queue2.offer("A");
        queue2.offer("J");
        queue2.offer("E");
        queue2.offer("F");
        queue2.offer("B");
        while (queue2.size() > 0) {
            System.out.print(queue2.remove() + " ");
        }
    }
}
