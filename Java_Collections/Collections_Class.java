package Java_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collections_Class {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(56);
        list.add(67);
        list.add(0);
        list.add(0);

       Collections.sort(list);
        System.out.println("Sorted lis is: "+ list);

Collections.sort(list, Comparator.reverseOrder());
        System.out.println("Sorted list in descending order: "+list);

        System.out.println(Collections.min(list));

        System.out.println(Collections.max(list));

        System.out.println(Collections.frequency(list, 0));

    }
}
