package  Core_Java;
class MyThread extends Thread{
    int j = 0;
    @Override
    public void run(){
        while(j<100){
            System.out.println("My thread is running!");
            j++;

        }
    }
}
class MyThread2 extends Thread{
    int i = 0;
    @Override
    public void run(){
        while(i<100){
            System.out.println("My thread 2 is running!");
            i++;
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 =  new MyThread2();
        t1.start();
        t2.start();
    }
}
