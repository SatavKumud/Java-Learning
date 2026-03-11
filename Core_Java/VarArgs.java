package  Core_Java;
public class VarArgs {
//    static int sum(int a, int b){
//        return a+b;
//    } it is normal arguments wala method


    //this is varargs method
    static int add(int ... arr){
       //available as  int [] arr
        int result = 0;
        for(int a  : arr){
            result += a;
        }
        return result;
    }

//Making one argument as compulsary which is x
    static int add1(int x, int ... arr){
        //available as  int [] arr
        int result = x; //x is compulsary parameter
        for(int a  : arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println("The sum of 4 and 5 is:"+ sum(4,5 ));
//        System.out.println("The sum of 4,5 and 66 is:"+ sum(4,5,66));
        // not allowed cause there are 2 arguments allowed not 3. this problem is solved using var args as we can give as many as arguments using it.

        System.out.println("Sum of values is:"+ add(1,2));
        System.out.println("Sum of values is:"+ add(34, 56, 87));
        System.out.println("Sum of values is:"+ add(90, 56, 4, 24, 36, 76));
        System.out.println("Sum is"+add());
        System.out.println("Sum of 1 is:"+ add(1));


        System.out.println("Add1 is called:" + add1(23, 56, 34));
    }
}
