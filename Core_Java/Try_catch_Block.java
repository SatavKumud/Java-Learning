package  Core_Java;
public class Try_catch_Block {
    public static void main(String[] args) {
        int a = 8000;
        int b = 0;
        
        try{
            float c = a/b;
            System.out.println("The result is: "+c);
        }
        catch(Exception e){
            System.out.println("We failed to divide, Reason :" + e);
        }

    }
}
