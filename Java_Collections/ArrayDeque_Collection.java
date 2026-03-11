package Java_Collections;

import java.util.ArrayDeque;

public class ArrayDeque_Collection {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.offer(23);
        ad.offerFirst(43);
        ad.offerLast(78); //offerLast and offer works same adds element at last only i.e they append ele
        ad.offer(100);

        System.out.println("ArrayDeque is like this: "+ ad);

        ad.poll();
        System.out.println("After removing one element: "+ad);

        System.out.println("removing first ele: " +ad.pollFirst());

        System.out.println("removing last element: "+ ad.pollLast());
        ad.offer(300);
        System.out.println(ad);


        System.out.println("Peeking first element: "+ ad.peekFirst());//peekFirst and peek works same
        System.out.println("Peeking element: "+ ad.peek());
        System.out.println("Peeking last element: "+ ad.peekLast());
    }
}
