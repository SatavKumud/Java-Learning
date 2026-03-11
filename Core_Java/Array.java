package Core_Java;
public class Array {
    public static void main(String[] args) {

        int [] marks=  new int[5]; //Declaration+memory allocation
        marks[0] = 89;
        marks[1] = 67;
        marks[2] = 78;
        marks[3] = 56;
        marks[4] = 98;


         String [] names; //Declaration
        names = new String[3]; //Memory allocation
        names[0] = "Kumud";
        names[1] = "Sarita";
        names[2] = "Chinmai";


        int [] rollno = {32,21,1}; //declaration , memory allocation and initialization together

        System.out.println("Roll number of student is:" + rollno[0]);
        System.out.println("Name of student is:"+ names[0]);
        System.out.println("Marks of the student is:"+ marks[0]);
    }
}
