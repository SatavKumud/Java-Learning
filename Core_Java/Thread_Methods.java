package  Core_Java;
class Thread1 extends Thread{
    public void run(){
       // int i = 0;
        while(true){
            System.out.println("Threadddd");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //i++;
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("Threadddd.....");
            i++;
        }
    }
}



public class Thread_Methods {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        //t1.join(); //this can through exception

//        try{
//            t1.join(); //this method firstly run only t1 and when it completes it runs t2
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }

        Thread2 t2 = new Thread2();
        t2.start();

    }
}
