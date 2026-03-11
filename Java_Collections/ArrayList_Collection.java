package Java_Collections;

import Core_Java.Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Collection {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<String> l3 = new ArrayList<>();

        l1.add(23);
        l1.add(43);
        l1.add(78);
        l1.add(2,100);

        l2.add(345);
        l2.add(1111);
        l2.add(2,1000);
        l2.add(890);



        l3.add("Kumud");
        l3.add("Sarita");
        l3.add("Chinmai");
        l3.add("Swara");
        l3.add("Vaishnavi");

        l1.addAll(l2);
        System.out.println("List number 1: "+l1);
        System.out.println("List number 2: "+ l2);

        l1.remove(3);
        System.out.println("Elements of list 1 after removing one element: "+ l1);

        l2.remove(Integer.valueOf(345));
        System.out.println("Element of list 2 after removing one ele: "+  l2);

        System.out.println("Element of l2 at index 2: "+l2.get(2));

        System.out.println("Adding one element in list 1 at middle: "+ l1.set(3,8000));
        System.out.println(l1);

        System.out.println("Is 1000 present in list 2? : "+l2.contains(1000));

        //printing list 1
        System.out.println("List 1 is like this:" );
        for(int i = 0; i<l1.size(); i++){
            System.out.println( l1.get(i) );
        }

        //printing list 2
        System.out.println("List 2 is like this: ");
        for(Integer ele : l2){
            System.out.println( ele);
        }

        //printing list 3
        System.out.println("Iterator list 3 is like: ");
        Iterator<String> iterator_name = l3.iterator();
        while(iterator_name.hasNext()){
            System.out.print(","+iterator_name.next());
        }

    }
}
