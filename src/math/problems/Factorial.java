package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    //public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
    public static void main(String args[]){
        int b,facto=1;
        int number=5;//It is the number to calculate factorial
        for(b=1;b<=number;b++){
            facto=facto*b;
        }
        System.out.println("Factorial of "+number+" is: "+facto);
    }
}




