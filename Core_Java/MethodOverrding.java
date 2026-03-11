package  Core_Java;
class A{

    public void methodA(){
        System.out.println("Method of class A");
    }
    public void method(){
        System.out.println("This is simple method");
    }
}
class B extends A{
    @Override
    public void methodA(){
        System.out.println("Method of class B");
    }
}
public class MethodOverrding {
    public static void main(String[] args) {
        B b = new B();
        b.methodA(); //Latest method of class B will be executed as these method is overriden.
        b.method();

    }
}
