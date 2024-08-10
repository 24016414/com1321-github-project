import java.util.*;

public class practice{
    public static void main(String args[]){
        Scanner sim = new Scanner(System.in);

        System.out.println("ENTER PASSWORD");
        String password = sim.next();
        System.out.println("Confirm passsword");
        String naam =sim.next();
        Boolean result = naam.equals(password);

        if(result == true ){
            System.out.println("WELCOME");
        }else if(result == false){
            System.out.println("INCORRECT PASSWORD");
        }

       

    }
}