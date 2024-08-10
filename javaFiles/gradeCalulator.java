import java.util.Scanner;

public class gradeCalulator {
    public static void main(String[] args) {
        Scanner sim = new Scanner (System.in);

        System.out.println("ENTER MARK OF FIRST SUBJECT");
        int subject1 = sim.nextInt();
        System.out.println("ENTER MARK OF SECOND SUBJECT");
        int subject2 = sim.nextInt();
        System.out.println("ENTER MARK OF THIRD SUBJECT");
        int subject3 = sim.nextInt();

        int averege = (subject1+subject2+subject3)/3;

        if( averege <=100 && averege >=90 ){
            System.out.println("A");
        }else if( averege <= 89 && averege >= 80){
            System.out.println("B");
        }else if(averege <= 79 && averege >= 70){
            System.out.println("C");
        }else if(averege <= 69 && averege >= 60){
            System.out.println("D");
        }else if(averege <= 59 && averege >=0){
            System.out.println("F");
        }
    }
}
