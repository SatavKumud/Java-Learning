package  Core_Java;
interface Sample{
    void meth1();
    void meth2();
}
interface childSample extends Sample{ //inheritance in interface using extends
    void meth3();
    void meth4();
}
class mySamClass implements childSample{
    public void meth3(){
        System.out.println("This is ethod 3 from child");
    }
    public void meth4(){
        System.out.println("This is meth 4 from child");
    }

    @Override
    public void meth2() {
        System.out.println("This is method 2 extended in child interfcae from sample interface and implemented in mySamClass");
    }

    @Override
    public void meth1() {
        System.out.println("This is method 1 extended in child interfcae from sample interface and implemented in mySamClass");
    }
}

public class InheritanceInterface {
    public static void main(String[] args) {
        mySamClass msc = new mySamClass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();

    }
}
