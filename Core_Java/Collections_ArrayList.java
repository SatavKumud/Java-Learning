package Core_Java;
import java.util.*;

public class Collections_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(); //modified array
        ArrayList<Integer> l2 =  new ArrayList<>(5); // 5 is initital capacity
        l2.add(23);
        l2.add(34);
        l2.add(11);

        l1.add(2);
        l1.add(4);
        l1.add(7);

        l1.addAll(l2);//adding the another collection int existing l1


       // l1.addAll(0, l2); //adds elements of l2 from 0 index

        for(int i = 0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }

    }
}
