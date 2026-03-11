package  Core_Java;
import java.util.ArrayList;

public class Java_Generics {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>(); //<Integer> is generics that tells we are storing integer only

//        ArrayList a = new ArrayList();
//        a.add("Str1");
//        a.add(34);
//        a.add(56);

        //int a = a.get(2); //here it says you have added both string nd int and anything u can add
        // so if we want to solve without generics we will rewuire to typecast it. as below :

//        int b= (int) a.get(2);
//        System.out.println(b);

    }
}
