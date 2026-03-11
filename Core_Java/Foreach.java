package  Core_Java;
public class Foreach {
    public static void main(String[] args) {

        int [] rollno = {32,21,1};

        System.out.println("Length of the array is:"+rollno.length); //length property of the array

        //normal for loop
        System.out.println("Printing array using for loop: ");
        for(int i =0 ; i<rollno.length; i++){
            System.out.println(rollno[i]);

        }

        System.out.println("Printing the array using for loop in reverse order:");
        for(int i = rollno.length-1; i>=0; i--){
            System.out.println(rollno[i]);
        }

        System.out.println("Displaying array using for-each loop:");
        for(int ele: rollno){
            System.out.println(ele);
        }
    }
}
