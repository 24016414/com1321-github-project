import java.util.*;

public class validTriangle {
    public static void main(String[] args) {
        Scanner sim = new Scanner(System.in);

        System.out.println("ENTER THE LENGTH OF THE ADJECENT SIDE");
        int adjecent = sim.nextInt();

        System.out.println("ENTER THE LENGTH OF THE HYPOTENUS SIDE");
        int hypotenus = sim.nextInt();
        System.out.println("ENTER THE LENGTH OF THE OPPOSITE SIDE");
        int opposite = sim.nextInt();

        int sum = adjecent+hypotenus+opposite;

         if(sum == 180){
            System.out.println(" :VALID "+sum);
        }else if( sum > 180){
            System.out.println(" :NOT VALID "+sum);
        }else if(sum < 0 ){
            System.out.println(" :NOT TRIANGLE "+sum);
        }
    }
}
