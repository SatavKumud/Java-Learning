package Java_Collections;

import java.util.Arrays;

public class Arrays_Class {
    public static void main(String[] args) {
        Integer[] num ={1,2,3,4,5,6,7,8,9,20};
        int index = Arrays.binarySearch(num, 4); //works on sorted array

        System.out.println("The index of element 4 is: " + index);

        Integer[] num1 ={43,56,12,1,23,67,7};
        Arrays.sort(num1);
//        System.out.println(num1); no need to do this
        for(int i : num1){
            System.out.print(i +",");
        }
        System.out.println();

        Integer[] num2 ={43,56,12,1,23,67,7};
        Arrays.fill(num2, 0);
       // System.out.println(num1);
        for(int j: num2){
            System.out.print(j + ",");
        }

    }
}
