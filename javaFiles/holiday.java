import java.util.*;
public class holiday {
    public static void main(String args[]){
        Scanner sim = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER YOU WANT THE PATTERN TO CONTINUE ");
        int number = sim.nextInt();
         
        int n = 1;

        for( int m = 0; m < number; m++ ){
        
            System.out.print(n);
        
        if(m < number - 1){
            System.out.print(", ");
        }
            n*=2;

        }
    }
    }
