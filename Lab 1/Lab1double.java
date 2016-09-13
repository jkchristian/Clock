/* Christian Holz
Lab 1 Double
Per 6 */

import java.util.Scanner;


public class Lab1double {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pie = 3.14;
        double circumference = 0;
        double userinput = 0;
        int counter = 1;
        
        for(int i = 0; i < counter; i++){
        System.out.println("Enter the radius of a circle to find the circumference");
        userinput = in.nextInt();

        if(userinput <=0){
            System.out.println("Sorry, but you can't enter a negative number to find the circumference");
            System.out.println("Can you please enter it again?");
            counter = counter + 1;
        }if (userinput >=1){
        
        circumference = (2*pie) * userinput;
        
        System.out.println("The circumference of a circle is: " + circumference);
    }
      }
    }
    
}
