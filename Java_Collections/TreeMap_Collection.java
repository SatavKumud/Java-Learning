package Java_Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Collection {
    public static void main(String[] args) {
        Map<String, Integer> stud = new TreeMap<>();
        stud.put("Kumud", 32);
        stud.put("Sarita", 33);
        stud.put("Mamta", 34);

        stud.putIfAbsent("Mamta", 35);
        stud.putIfAbsent("Mahek", 56);

        System.out.println(stud);

        //iteration

        System.out.println("Key and value pairs in the map are: ");
        for (Map.Entry<String, Integer> var : stud.entrySet()) {
            System.out.println(var);
        }

        System.out.println("Keys in the map are: ");
        for (String key : stud.keySet()) {
            System.out.println(key);
        }

        System.out.println("Values in the map are: ");
        for (Integer val : stud.values()) {
            System.out.println(val);
        }
    }
}
