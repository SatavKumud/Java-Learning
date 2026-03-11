package  Core_Java;
import javax.print.attribute.standard.Media;


interface GPS{
    void location();
}
interface Cameras{
    void click();

}
interface MediaPlayer{
    void playmusic();

}
class SmartPhone2 implements GPS, Cameras, MediaPlayer{

    void smartPhonemeth(){
        System.out.println("This is the method of SmartPhone class. ");
    }
    @Override
    public void click() {
        System.out.println("Click the photos only");
    }

    @Override
    public void location() {
        System.out.println("Share the location using GPS");
    }

    @Override
    public void playmusic() {
        System.out.println("Play Bhajan..");
    }
}

public class Polymorphism_using_Interfaces {
    public static void main(String[] args) {
        GPS g =  new SmartPhone2();//this is smartphone but use it as a GPS only
        g.location();
       //g.click(); --> this is not allowed as the reference is of the GPS only we can use only its methods not methods of other interfaces

        Cameras c = new SmartPhone2();
        c.click();

        MediaPlayer mp = new SmartPhone2();
        mp.playmusic();

        //Note:
        // if we create object of SmartPhone2 class then we can use all methods.
        // g.smartPhonemeth(); --> this is method of smartPhone2 class but still we cannot use it.

    }
}
