import java.util.*;

public class meaningOfGrade {
    public static void main(String[] args) {
        Scanner sim = new Scanner(System.in);
        
        System.out.println("ENTER GRADE");
        Character grade = sim.next().charAt(0);

        if(grade == 'A'){
            System.out.println("EXCELLENT");
        }else if(grade == 'B'){
            System.out.println("GOOD");
        }else if(grade == 'C'){
            System.out.println("AVEREGE");
        }else if(grade == 'D'){
            System.out.println("DEFICIENT");
        }else if(grade == 'E'){
            System.out.println("FAILLING");
        }else if(grade !='A' && grade !='B' && grade !='C' && grade != 'D' && grade !='E'){
            System.out.println("PLEASDE ENTER A GRADE FROM A TO E TO GET CORRECT MEANING");
        }
        
    }
}
