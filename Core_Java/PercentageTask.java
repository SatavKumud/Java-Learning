package  Core_Java;
import java.util.Scanner;
public class PercentageTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Chemistry:");
        float chem = sc.nextFloat();
        System.out.println("Enter the marks of Physics:");
        float phy = sc.nextFloat();
        System.out.println("Enter the marks of Maths:");
        float maths= sc.nextFloat();
        System.out.println("Enter the marks of English:");
        float eng = sc.nextFloat();
        System.out.println("Enter the marks of History:");
        float his = sc.nextFloat();

        float total = chem+phy+maths+his+eng;

        float percentage = (total/500)*100;

        System.out.println("Your percentage are:"+percentage);

    }
}
