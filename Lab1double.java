
package lab1double;

import java.util.Scanner;


public class Lab1double {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pie = 3.14;
        double circumference = 0;
        double userinput = 0;
        
        System.out.println("Enter the radius of a circle to find the circumference");
        userinput = in.nextInt();
        
        circumference = (2*pie) * userinput;
        
        System.out.println("The circumference of a circle is: " + circumference);
      
    }
    
}
