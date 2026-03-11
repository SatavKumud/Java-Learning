package Java_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_w_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); //LinkedList using Queue

        q.offer(32);
        q.offer(45);
        q.offer(56);
        q.offer(567);

        System.out.println("Queue is like this: "+q );


        System.out.println("Removing element: "+q.poll());

        System.out.println("Queue after removing element is: "+q);

        System.out.println("Peeking the element : "+q.peek());


    }
}
