import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int y = 1;
        for (int i = 1; i <= x; i++) {
            y = y * i;
        }
        return y;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
    double e=0;
    for(int i=0; Math.abs(e-Math.E)>0.00001;i++){
   e+=1/factorial(i);}
        System.out.println("the value of e is roughly ");
    return e;
    }




    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a positive number! ");
        double input=scan.nextDouble();
        double posnum=input/2;
            for(int i=0; i<10;i++){
                posnum=(input/posnum+posnum)/2;
            }
        System.out.println("the square root of " + input + " is ");
        return posnum;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(factorial(5));
        System.out.println(calculateE());
        System.out.println(babylonian(4));



        scan.close();
    }
}
