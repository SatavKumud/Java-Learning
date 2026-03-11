package  Core_Java;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int turn = 0 ;
        int uwin = 0;
        int cwin = 0;
        while( turn <= 5){
            System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Scissor:");
            int user = sc.nextInt();

            int comp = random.nextInt(3);
            System.out.println("Computer's choice is:"+comp);

            if(comp == 0 && user == 1 || comp == 1 && user == 2 || comp == 2 && user == 0)
            {
                System.out.println("You win this turn!!");
                uwin++;
            }
            else if(comp == 1 && user == 0 || comp == 2 && user == 1 || comp == 0 && user == 2)
            {
                System.out.println("Computer win this turn, better luck next time !");
                cwin++;
            }
            else
            {
                System.out.println("Its a tie");
            }


            turn ++;

        }
        if(cwin > uwin){
            System.out.println("Computer win the whole" +
                    " game");
        }
        else{
            System.out.println("You win the whole game");
        }


    }
}
