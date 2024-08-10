import java.util.*;

public class guess{
    public static void main(String args []){
        Scanner sim = new Scanner(System.in);

        //System.out.println("PLEASE ENTER YOUR NAME");
        //String name = sim.nextLine();
       // System.out.println("WELCOME "+ name +" to the guessing game ");
        System.out.println(" ");
        System.out.println("**PLEASE PLAY BY GUESSING THE NUMBER THE DICE WILL ROLL BETWEEN 1 - 6**");
        int b = sim.nextInt();
        //System.out.println("you guessed"+b);

        Random sim1 = new Random ();
        int a = sim1.nextInt(6)+1;
        //System.out.println(" DICE ROLLED: "+a);
        

        if( b==a){
            System.out.println(" You guessed "+b);
            System.out.println(" DICE ROLLED: "+a);
            System.out.println("congradulation you guessed correct*** guess again to move to the next level");
        } else if (b!=a && b <6){
            System.out.println(" You guessed "+b);
            System.out.println(" DICE ROLLED: "+a);
            System.out.println("almost guessed correct try again");
    }
         else if (b>6){ 
            System.out.println("ERROR! TRY A NUMBER WITHIN THE RANGE OF THE DICE");
         }

    }
}