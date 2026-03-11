package Core_Java;
import java.util.HashSet;

public class Collections_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>(6, 0.5f);
        h1.add(3);
        h1.add(3);
        h1.add(5);
        h1.add(89);

        System.out.println(h1);
    }
}
