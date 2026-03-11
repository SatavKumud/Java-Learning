package Core_Java;
import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "I am toString()";
    }
   public String getMessage(){
        return "I am getMessage()";
   }
}

public class CustomException {
    public static void main(String[] args) throws ArithmeticException //throws --> warning
    {
        int a ;
        System.out.println("Enter the value of a : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<9){
            try{
               // throw new MyException(); commented because only one Exception can be thrown at a time
                throw new ArithmeticException("This is an Exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString()); // we explicitly call toString()
                System.out.println(e); // directly calls toString
                e.printStackTrace(); // its not an error
                System.out.println("Finished?");

            }
            System.out.println("Yes, Finished");

        }
    }
}
