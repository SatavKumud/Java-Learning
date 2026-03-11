package  Core_Java;
class FinallyBlock {
    public static int greet(){
        try{
            int a =50;
            int b =0;
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Inside finally block"); //the value of c i returned
            // but still this run istead of breaking the code flow because its finally block
        }
        return -1;
    }
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);


        int a =9;
        int b = 8;

        while(true){
           try{
               System.out.println(a/b);
           }
           catch(Exception e){
               System.out.println(e);
               break; // as the value of becomes 0 it should stop
               // but still finally block run f0r value of b as 0 after showing arithmetic error
           }
           finally{
               System.out.println("This is finally block for value of b:" + b);
           }
           b--;
        }

    }
}
