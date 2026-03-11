package  Core_Java;
class Base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void printme(){
        System.out.println("I am method of base");
    }
}
class Derived extends Base{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public void  printD(){
        System.out.println("I a" +
                "m method of Derived class");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.printme();
        d.printD();

        d.setY(32);
        System.out.println(d.getY());

        d.setX(33);
        System.out.println(d.getX());


    }
}
