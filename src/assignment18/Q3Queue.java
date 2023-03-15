package assignment18;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q3Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(23);
        queue.add(43);
        queue.add(56);
        queue.add(70);
        System.out.println(queue);
        System.out.println(queue.peek()); //gives the first element
        queue.poll(); //removes the first element
        System.out.println(queue);
        System.out.println(queue.element()); //gives the first element from start
        System.out.println(queue.contains(70));
    }
}

/*
[23, 43, 56, 70]
23
[43, 70, 56]
43
true

 */