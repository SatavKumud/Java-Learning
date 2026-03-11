package  Core_Java;
class MThread extends Thread{
    public MThread(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("I am thread with name :  "+this.getName());
            i++;
        }
    }
}


public class Thread_Priorities {
    public static void main(String[] args) {
        MThread mt = new MThread("Kumud's Thread its most important thread");
        mt.setPriority(Thread.MAX_PRIORITY);
        mt.start();
        MThread mt1 = new MThread("Sarita's Thread");
        mt1.setPriority(Thread.MIN_PRIORITY);
        mt1.start();
        MThread mt2 = new MThread("Chinmai's Thread");
        mt2.start();

    }
}
