package Core_Java;
class Phone{
    public void showTime(){
        System.out.println("Time is 8.14pm ");
    }
    public void on(){
        System.out.println("Switching on the Phone...");
    }
}

class SmartPhone extends  Phone{
    public void playMusic(){
        System.out.println("Play the music");
    }
    public void on(){
        System.out.println("Switching on the SmartPhone...");
    }
}

public class DynamicMethDispatch {
    public static void main(String[] args) {

        //Super obj = new Sub(); allowed
        Phone supobj =  new SmartPhone(); //Dynamic method dispatch --> which method to run is decided and object will created at run time only

        //sub obj = new Super(); not allowed
        //SmartPhone obj = new Phone(); // this is not allowed as Smartphone is subclass

        supobj.on(); //as the obj is created of subclass i.e SmartPhone its method will run
        supobj.showTime(); //this can run as the Phone is super class i.e the refrence
        //supobj.playMusic(); // this will not run cause this is the method of SmartPjone which will require the reference of only the SmartPhone class
        //SmartPhone sub =  new SmartPhone(); now this will run

    }
}
