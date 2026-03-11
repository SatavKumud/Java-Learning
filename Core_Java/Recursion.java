package  Core_Java;
import java.util.Scanner;

public class Recursion {
//    static int factorial(int n){
//        //factorial(n) = n*n-1*.......1
//        //factorial(5) = 5*4*3*2*1 = 120
//        if(n == 0 || n == 1){
//            return 1;
//        }
//        else{
//            return  n * factorial(n-1);
//        }
//    }
//
//    static int fact_iterative(int n){
//        if(n == 0 || n == 1){
//            return 1;
//        }
//        else{
//            int product = 1;
//            for(int i =1; i<=n ; i++){
//                product *= i;
//            }
//            return product;
//        }
//    }


    public static int fibonacci(int n) {

        // If n is 0 or 1, return n (base cases)
        if (n <= 1) {
            return n;
        }

        // // Recursive case
        // For any other number, return the sum of the two preceding numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
//        int n = 4;
//        System.out.println("The value of factorial n is:" + factorial(n));
//        System.out.println("Factorial using iteration of n is: "+ fact_iterative(n));

            // int count = 10; //Example input


            // Create a Scanner object for user input
            Scanner sc = new Scanner(System.in);

            // Prompt the user to enter the number of Fibonacci terms to print
            System.out.println("Enter the count of fibonacci series:");
            int n = sc.nextInt();

            // Loop to print each Fibonacci number up to the 10th term
            for (int i = 0; i < n; i++) {
                // Call the fibonacci method for the current value of i and print the result
                System.out.print(fibonacci(i) + " ");
            }


            
    }
}
