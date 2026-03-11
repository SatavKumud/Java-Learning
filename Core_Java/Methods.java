package  Core_Java;
import java.util.*;
public class Methods {
    static int add(int a, int b){
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter first number:");
        int x= sc.nextInt();

        System.out.println("Enter second number:");
        int y = sc.nextInt();

        int z = add(x,y);
        System.out.println("Sum is:"+ z);
    }
}
