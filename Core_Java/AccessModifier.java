package Core_Java;
class C1{
    public int x = 5; //all yes
    protected int y = 45; // class,package,subclass --> yes , world --> no
    int z = 6; // class, package --> yes, protected, world --> no
    private int a = 78; //class --> yes, package,subclass and world --> no
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        C1 c =  new C1();
        c.meth1();
    }
}
