import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner sim = new Scanner(System.in);

        System.out.println("ENTER THE SECoNDS");

        int seconds = sim.nextInt();
        
        int minutes = seconds / 60;
        int hours = seconds/3600;

        System.out.println("HOURS :"+hours);
        System.out.println("MINUTES :"+minutes);
        System.out.println("seconds :"+seconds);    
    }
}
