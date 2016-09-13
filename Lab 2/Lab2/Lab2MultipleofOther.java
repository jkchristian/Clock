/*
Christian Holz
Lab 2 Multiple of the second
Per 6
*/
import java.io.*;
import java.util.Scanner;

public class Lab2MultipleofOther {

   
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int integerfirst = 0;
       int integersecond = 0;
       
       System.out.println("Please enter your first integer");
       integerfirst = in.nextInt();
       System.out.println("Enter your second integer");
       integersecond = in.nextInt();
       
       int multother;
       
       multother = integerfirst % integersecond;
       if(integerfirst % integersecond  != 0){
           System.out.println("First integer is a multiple of second integer ");
           System.out.println(multother);
       }
       else {
            System.out.println("First integer is not multiple of second integer ");
            System.out.println(multother);
       }
       
       
       
    }
    
}
