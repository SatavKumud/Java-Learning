package  Core_Java;
interface Bicycle{
    void applyBreak(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Horn sound");
    }
    public void applyBreak(int decrement){
        System.out.println("Apply the break by:"+ decrement);
    }

    public void speedUp(int increment){
        System.out.println("Speed up the cycle");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.applyBreak(12);
        ac.blowHorn();


    }
}
