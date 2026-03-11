package Core_Java;
class Base1{

    Base1(){
        System.out.println("I am  constructor of base");
    }
    Base1(int a){
        System.out.println("The overloaded constructor"+ a);
    }

}
class Derived1 extends Base1{

    Derived1(){
        //super(0);//this is used if u want the immediate super constructor here the overloaded constructor
        System.out.println("I am the constructor of derived class");
    }
    Derived1(int y, int a){
        super(a);
        System.out.println("Derived ka overloaded constructor with va" +
                "lue of y as: "+y);
    }
}

public class ConstructorsInInheritance {
    public static void main(String[] args) {
        //Base1 b = new Base1();
//        Derived1 d =  new Derived1(); //derive class also inherites the constructors of base class and the derived class.
        //This will choose the constructor without parameter only one constructor will get printed

        Derived1 d =  new Derived1(12, 32);


    }
}
