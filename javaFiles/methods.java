public class methods {
    public static void main(String args[]){
        //METHOD = IS A BLOCK OF CODE THAT IS EXECUTED WHENEVER IT IS CALLED UPON.
        //OVERLOADED METHOD = METHODS THAT SHARE THE SAME NAME BUT HAVE DIFFERENT PARAMETERS.
        multiply(2 , 4);
       int a =2;
       int b =2;
       int c =2; 
       int z = multiply(a, b, c);
        /*add(2,3);
        divide(4, 1);*/
        String naam = "buhle";
        int number = 3;
        name(naam, number);
        System.out.println(z);
    }
    static void multiply(int a , int b){
        System.out.println("THE MULTIPLIED ANSWER IS: "+a*b);
    }
    static int multiply(int a, int b, int c){
        int z = a+b+c;
        return z;
    }
    static void name(String naam, int number){
        System.out.println("YOUR NAME IS :Michell "+naam+"\n YOUR NUMBER IS: " +number);
    }
}
