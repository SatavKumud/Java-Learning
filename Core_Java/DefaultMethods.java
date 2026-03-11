package Core_Java;
interface Camera{
    void click();
    void recordVdo();
    private void greet(){
        System.out.println("Good morning");
    }
   default void record4Kvod(){// here if we add this method in this interface without default
       // then we will be needed to add this method in all the classes implementing this interfaces which will not be possible
       // as a result the classes will get failed so default methods are used as we use default keywprd
       // at that time we can write its implementation in that interface only so it wil not required to add in each class
       // and we can overrride it in required class only but then the overriden method will run i.e the latest method.
        greet();
       System.out.println("recording 4K video");
   };
}
interface WiFi{
    String[] getNetworks();
    void connectToNw(String network);
}
class CellPhone{
    void call(int number){
        System.out.println("Calling "+number);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }

}
class SmartPhones extends CellPhone implements WiFi, Camera{
    public void  recordVdo(){
        System.out.println("Recording the video");
    }

//    @Override
//    public void record4Kvod(){
//        System.out.println("recording a 4k vdo from SmarrtPhone.");
//    }
    public void click(){
        System.out.println("Click the photo");
    }
    public String[] getNetworks(){
        System.out.println("Getting the list of networks");
        String[] networkslist = {"Kumud", "Saru"};
        return networkslist;
    }
    public void connectToNw(String network){
        System.out.println("Connecting to: "+network);
    }

}


public class DefaultMethods {
    public static void main(String[] args) {
        SmartPhones s = new SmartPhones();
        String[] ar = s.getNetworks();
        for(String item:ar){
            System.out.println(item);
        }
        s.call(100);
        s.pickCall();
        s.connectToNw("Kom's network");
        s.record4Kvod();

    }
}
