
package  Core_Java;
class NegativeRadiusException extends Exception{
    public String toString(){
        return "radius cannot be negative";
    }

}
public class ThrowsKeyword {

    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{

        int result  = a/b;
        return result;
    }
    public static void main(String[] args) {

        try{
            int c =  divide(6,2);
            System.out.println(c);

            double ar =  area(-2);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception occurred " + e);
        }


    }
}
