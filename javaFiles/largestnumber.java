import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args) {
        Scanner sim = new Scanner(System.in);

        System.out.println("ENTER A NUMBER");
        int number = sim.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int secondNumber = sim.nextInt();
        System.out.println("ENTER A THIRD NUMBER");
        int thirdNumber = sim.nextInt();

        if(number > secondNumber && number > thirdNumber ){
        System.out.println("THE LARGEST NUMBER IS :"+number);
        }else if(secondNumber > number && secondNumber> thirdNumber){
            System.out.println("THE LARGEST NUMBER IS :"+secondNumber);
        }else if(thirdNumber > number && thirdNumber > secondNumber){
            System.out.println("THE LARGEST NUMBER IS :"+thirdNumber);
        }

      
    }
}
