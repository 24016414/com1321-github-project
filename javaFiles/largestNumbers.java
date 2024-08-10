import java.util.*;
public class largestNumbers {
    public static void main (String []args){
    Scanner sim = new Scanner(System.in);

    System.out.println("ENTER ANY NUMBER");
    int firstNumber = sim.nextInt();
    System.out.println("ENTER SECOND NUMBER");
    int secondNumber = sim.nextInt();

    if( firstNumber > secondNumber){
        System.out.println("THE LARGEST NUMBER IS : "+firstNumber);
    }else if(secondNumber > firstNumber){
        System.out.println("THE LARGEST NUMBER IS : "+secondNumber);
    }else if( firstNumber == secondNumber){
        System.out.println("THE NUMBERS ARE EQUAL : "+firstNumber+" = "+secondNumber);
    } 
        
    }
}