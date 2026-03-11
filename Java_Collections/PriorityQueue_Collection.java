package Java_Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_Collection {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(32);
        pq.offer(56);
        pq.offer(45);
        pq.offer(567);
        System.out.println("Queue is like this: "+pq );
        System.out.println("Removing element: "+pq.poll());
        System.out.println("Queue after removing element is: "+pq);
        System.out.println("Peeking the element : "+pq.peek());

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        pq1.offer(10);
        pq1.offer(1);
        pq1.offer(2);
        pq1.offer(4);
        pq1.offer(5);
        System.out.println("Queue is like this: "+pq1 );
        System.out.println("Removing element: "+pq1.poll());
        System.out.println("Queue after removing element is: "+pq1);
        System.out.println("Peeking the element : "+pq1.peek());
    }
}
