/*
Christian Holz
Lab 1 gas consumption 
Per 6
*/
package lab1gasspeed;

import java.util.Scanner;

public class Lab1GasSpeed {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gas; 
        int start;
        int end;
        int odometer;
        
        System.out.println("Please enter the number of gallons you have");
        gas = in.nextInt();
        System.out.println("Please enter the start of distane");
        start = in.nextInt();
        System.out.println("Please enter the end of distane");
        end = in.nextInt();
        
        
        //math part
        odometer = ((end - start) / gas);
        
        //end print out part
        System.out.println("Your odometer is: " + odometer);
    }
    
}
