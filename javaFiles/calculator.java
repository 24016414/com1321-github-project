import java.util.Scanner;

public class calculator {
    public static void main (String args[]){
        Scanner sim = new Scanner(System.in);

    System.out.print("PLEASSE ENTER YOUR NAME:");
    String name = sim.nextLine();
    int a, b;
    System.out.println("    ");
    System.out.println("***WELCOME "+name+ " TO THE CASSIO PRO MAX***");
    System.out.println("                                   ");
    System.out.println("***SELECT THE MATHEMATICAL OPERATION YOU WOULD LIKE TO PERFORM***");
    System.out.println("    1.ADDITION        (+)");
    System.out.println("    2.SUBRACTION      (-)");
    System.out.println("    3.MULTIPLICATION  (*)");
    System.out.println("    4.DIVISION        (/)");
    System.out.println("    5.MODULUS         (%)");
    System.out.print(" ...:");

    int n = sim.nextInt();
    switch (n) {
        case 1 : System.out.println("**ADDITION**");
        System.out.println("ENTER THE NUMBERS YOU LIKE ADD");
        a = sim.nextInt();
        b = sim.nextInt();
        int c1 = a+b;
        System.out.println("ANS: "+c1);
        break;

        case 2 : System.out.println("**SUBRACTION**");
        System.out.println("ENTER THE NUMBERS YOU LIKE SUBRACT");
        a = sim.nextInt();
        b = sim.nextInt();
        int c2 = a-b;
        System.out.println("ANS: "+c2);
        break;

        case 3 : System.out.println("**MULTIPLICATION**");
        System.out.println("ENTER THE NUMBERS YOU LIKE TO MULTIPLY");
        a = sim.nextInt();
        b = sim.nextInt();
        int c3 = a*b;
        System.out.println("ANS: "+c3);
        break;

        case 4 : System.out.println("**DIVISION**");
        System.out.println("ENTER THE NUMBERS YOU LIKE TO DIVIDE");
        a = sim.nextInt();
        b = sim.nextInt();
        int c4 = a/b;
        System.out.println("ANS: "+c4);
        break;

        case 5 : System.out.println("**MODULUS**");
        System.out.println("ENTER THE NUMBERS YOU LIKE TO MODULUS");
        a = sim.nextInt();
        b = sim.nextInt();
        int c5 = a/b;
        System.out.println("ANS: "+c5);
        break;
        default:System.out.println("INCORRECT NUMBER PLEASE CHOOSE FROM THE ONES IN THE PROVIDED OPTIONS");
            break;
    }
    }
}
