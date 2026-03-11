package Core_Java;
interface DemoAno{
    void meth1();
    void meth2();
}
//This is traditional method that we use to call methods odf interface that is by implementing is
//for implementing we need to create a class that implements the interface ad then we create the object of that class and call methods


//class Anonymous implements DemoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    public void meth1(){
//        System.out.println("This is method 1");
//
//    }
//
//    public void meth2(){
//        System.out.println("This is method 2");
//    }
//}

public class Anonymous_Class {

    public static void main(String[] args) {

        //this is how we used to do that by making obj of class and then calling methods of interface that we have implemented.
//        Anonymous a = new Anonymous();
//        a.meth1();


        //this is anonymous class --> a class without name
        DemoAno obj = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("This is method 1");
            }

            @Override
            public void meth2() {
                System.out.println("This is method 2");

            }
        };

        obj.meth1();
        obj.meth2();

    }
}
