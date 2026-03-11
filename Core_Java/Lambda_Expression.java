package  Core_Java;
@FunctionalInterface   //functional interface means interface with one method only
interface DemoAno1{
    void meth1(int a);
}

//using lambda function

public class Lambda_Expression{
    public static void main(String[] args) {
        DemoAno1 obj = (a) -> {
            System.out.println("I am method 1 from this lambda "+ a); //this is implementation of meth 1
        };
        obj.meth1(10);
    }
}

//this is traditional method

//class Func implements DemoAno1{
//
//    public void meth1(){
//        System.out.println("This is meth 1 example of lambda func");
//    }
//
//}
//
//public class Lambda_Expression {
//    public static void main(String[] args) {
//
//        DemoAno1 obj = new Func();
//        obj.meth1();
//
//    }
//}
