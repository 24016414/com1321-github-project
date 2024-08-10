import java.util.*;

public class game {
    public static void main(String[] args) {
        Scanner sim = new Scanner (System.in);
        Random sim1 = new Random();

        System.out.println("PLEASE ENTER NAME PLAYER 1");
        String name = sim.nextLine();
        System.out.println("PLEASE ENTER NAME PLAYER 2");
        String naam = sim.nextLine();

        System.out.println("  ");
        System.out.println("WELCOME "+name + " AND "+naam+" TO THE GAME OF ROCK, PAPER & SCISSOR ");
        System.out.println("  ");

        Long a = sim1.nextLong(3)+1;
        Long b = sim1.nextLong(3)+1;

        if(a==1){
            System.out.println(name+": ROCK");
        }else if ( a==2) {
            System.out.println(name+": SCISSOR");
        } else if( a ==3){
           System.out.println(name+": PAPER"); 
        }
        
        if(b==1){
            System.out.println(naam+": ROCK");
        }else if ( b==2) {
            System.out.println(naam+": SCISSOR");
        } else if( b ==3){
           System.out.println(naam+": PAPER"); 
        }
        
        if (a<b){
            System.out.println("  ");
            System.out.println(name+" ***IS THE WINNER***");
            System.out.println("*****************************  ");
        }else if(a>b){
            System.out.println("  ");
            System.out.println(naam+"***IS THE WINNER***");
            System.out.println("*****************************  ");
        }else if (a==b){
            System.out.println("IT'S A TIE PLAY AGAIN!!!");
        }}}
