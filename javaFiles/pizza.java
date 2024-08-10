import java.util.*;

public class pizza {
    public static void main(String[] args) {
        
        Scanner sim = new Scanner(System.in);

        System.out.println("**PLEASE ENTER YOUR NAME**");
        String name = sim.nextLine();
        
               System.out.println(" ");
        System.out.println(" WELCOME "+name+ " WHAT WOULD YOU LIKE TO EAT TODAY");
        System.out.println("*************************************************");
        System.out.println("");
            System.out.println("*****PIZZA SIZES*****");
            System.out.println("    1.LARGE  = R60 ");
            System.out.println("    2.MEDIUM = R50 ");
            System.out.println("    3.SMALL  = R30 ");
            System.out.println("********************");
            System.out.println("PLEASE SELECT THE NUMBER OF THE PIZZA SIZE YOU WANT");
           int size =sim.nextInt();
           if(size==1){
            size= 60;
           }else if (size == 2){
            size = 50;
           }else if(size == 3){
            size = 30;
           }
         
            System.out.println("**TOPPINGS PRIZE RANGE**");
            System.out.println("  1.1-TOPPING  = R10    ");
            System.out.println("  2.2-TOPPINGS = R25    ");
            System.out.println("  3.3-TOPPINGS = R40 ");
            System.out.println("HOW MANY TOPPINGS WOULD YOU LIKE TO ADD SELECT A NUMBER");
        int topping = sim.nextInt();
        if(topping == 1){
            topping = 10;
        }else if( topping ==2){
            topping = 25;
        }else if( topping ==3){
            topping = 40;
        }

            System.out.println("**DELIVERY COST**");
            System.out.println("  1.WITHOUT DELIVERY = RO");
            System.out.println("  2.WITH DELIVERY    = R30");
            System.out.println("DO YOU WANT IT WITH DELIVERY OR WITHOUT DELIVERY PLEASE CHOOSE A NUMBER OF YOUR CHOICE");
        int delivery = sim.nextInt();
            if(delivery==1){
                delivery = 0;
            }else if(delivery == 2){
                delivery = 30;
            }
       
       
        int totalPrize = size + topping + delivery;
        System.out.println("YOUR TOTAL PRIZE IS:"+totalPrize +" Rands");
        System.out.println("THANK YOU "+name+" FOR USING OUR SERVICES \n\nPLEASE BE PATIENT YOU WILL RECEIVE YOUR ORDER IN A FEW MINUTES");
       
    }
}
