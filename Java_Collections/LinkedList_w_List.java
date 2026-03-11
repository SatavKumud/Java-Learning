package Java_Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedList_w_List {
    public static void main(String[] args) {
        List<Integer> q = new LinkedList<>(); //LinkedList creating using List

        q.add(23);
        q.add(43);
        q.add(78);
        q.add(2,100);

        q.remove(3);
        System.out.println("Elements of list 1 after removing one element: "+ q);


        System.out.println("Adding one element in list 1 at middle: "+ q.set(3,8000));
        System.out.println(q);

        //printing list 1
        System.out.println("List 1 is like this:" );
        for(int i = 0; i<q.size(); i++){
            System.out.println( q.get(i) );
        }



    }
}
