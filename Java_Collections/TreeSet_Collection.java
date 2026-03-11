package Java_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Collection {
    public static void main(String[] args) {
        Set<Integer> hs = new TreeSet<>(); //as hashset implements set interface and also have properties of binary tree
        //TreeSet<Integer> hs = new TreeSet<>();  this is also allowed

        //here elements are stored in sorted manner only

        hs.add(45);
        hs.add(54);
        hs.add(32);
        hs.add(23);
        hs.add(1000);

        System.out.println("HashSet is like this: "+ hs);

        hs.remove(1000);
        System.out.println("Hashset after removing element: "+hs);

        System.out.println("Is 1000 present? : "+hs.contains(1000));

        System.out.println("Size of hashset is: "+ hs.size());

        System.out.println("Is hashset empty? : "+ hs.isEmpty());

        System.out.println("Hashset is cleared");
        hs.clear();
        System.out.println("Is hashset empty? : "+ hs.isEmpty());

    }
}
