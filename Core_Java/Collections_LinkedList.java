package Core_Java;
import java.util.LinkedList;

public class Collections_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

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
        System.out.println("This is LinkedList");
    }
}
