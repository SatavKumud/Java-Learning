package Core_Java;
abstract class Parent{
    public Parent(){
        System.out.println("I am an constructor of base 2");
    }
    public void sayHello(){
        System.out.println("Hello i m metod of base 2");
    }
    abstract  public void greet();
}
class Child extends Parent{
    public Child(){
        super();
    }

   @Override
   public void greet(){

        System.out.println("Good morning!");
    }
}

public class AbstractC_M {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
        c.sayHello();


    }
}
