package Java_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Pair<K,V>{
    K key;
    V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }
    public Object getKey(){
        return this.key;
    }
    public Object getvalue(){
        return this.value;
    }

}

public class GenericPractice {
    public static<T> void printElements(List<T> l){
        for(T ele : l ){
            System.out.println(ele);
        }
    }

    public static double sumOfNumbers(List<? extends Number> list){
        double sum = 0;
        for(Number ele : list){
            sum += ele.doubleValue(); //converts value to double value
        }
        return sum;
    }

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(32, "Kumud");
        System.out.print(p1.getKey());
        System.out.println(p1.getvalue());

        Pair<String, Double> p2 = new Pair<>("Saru", 32.22);
        System.out.print(p2.getvalue());
        System.out.println(p2.getKey());


        List<String> sl = Arrays.asList("Java", "C");
        printElements(sl);


        List<Integer> intl = Arrays.asList(10,20,30,40);
        List<Double> dl = Arrays.asList(1.5,3.4, 6.7);

        System.out.println(sumOfNumbers(intl));
        System.out.println(sumOfNumbers(dl));

    }
}
