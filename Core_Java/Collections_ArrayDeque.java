package Core_Java;
import java.util.ArrayDeque;

public class Collections_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer>  ad1 =  new ArrayDeque<>();
        ad1.add(6);
        ad1.add(7);

        ad1.add(6);
        ad1.add(8);
        ad1.add(111);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

//        for(int i = 0; i< ad1.size(); i++){
//            System.out.println(ad1[]);//this is wrong
//        }
    }
}
