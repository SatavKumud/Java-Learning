package  Core_Java;
import java.util.Scanner;
public class InputFromUser {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one:");
        int a = sc.nextInt();
        System.out.println("Enter number two:");
        int b = sc.nextInt();

        int c = a+b;

        System.out.println("The sum of numbers is:"+c);
    }
}
