package  Core_Java;
class T1 implements Runnable{
    int i = 0;
    public void run(){
        while(i<100){
            System.out.println("I am a thread");
            i++;
        }
    }
}
class T2 implements Runnable{
    int j =0;
    public void run(){
        while(j<100){
            System.out.println("I am a thread number 2");
            j++;
        }
    }
}
public class Multithreading2 {
    public static void main(String[] args) {
        T1 bullet1 = new T1();
        Thread gun1 =  new Thread(bullet1);


        T2 bullet2 = new T2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
