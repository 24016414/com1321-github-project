import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        Scanner sim = new Scanner(System.in);

        int a,b,c;
        System.out.println("ENTER THE LENGTH OF THE HYPOTENUS SIDE");
        a = sim.nextInt();

        System.out.println("ENTER THE LENGTH OF THE ADJECENT SIDE");
        b = sim.nextInt();

        System.out.println("ENTEER THE LENGTH OF THE OPPOSITE SIDE");
        c = sim.nextInt();

        double s = (a+b+c)/2;

        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

       System.out.println("AREA IS :"+area);
        
    }
}
