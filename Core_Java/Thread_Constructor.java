package  Core_Java;
class NewT extends Thread{
    public NewT(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("I am a thread");
            i++;
        }
    }
}


public class Thread_Constructor {
    public static void main(String[] args) {
        NewT n = new NewT("KumudThread");
        n.start();
        System.out.println("ID of the thread is: " + n.getId());
        System.out.println("Name of my thread is: "+n.getName());

    }
}
