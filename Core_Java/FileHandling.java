package Core_Java;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        //creating a file
//        File newf = new File("kumud.txt");
//        try{
//            newf.createNewFile();
//        }
//        catch(Exception e){
//            System.out.println("Unable to create file");
//            e.printStackTrace();
//        }


        //writing a file

//        try{
//            FileWriter myfilew = new FileWriter("kumud.txt");
//            myfilew.write("First file of java");
//            myfilew.close();
//        }
//        catch(Exception e){
//            e.printStackTrace();
//
//        }


        //reading a file

//        File f = new File("kumud.txt");
//        try{
//            Scanner sc = new Scanner(f);
//            while(sc.hasNextLine()){
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }



        //deletimg a file
        File f =  new File("kumud.txt");
        if(f.delete()){
            System.out.println("File is deleted");
        }else{
            System.out.println("Error occurred while deltimg file");
        }



    }
}
