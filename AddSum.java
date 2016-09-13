/* Christian Holz
Per 6
Lab 1 AddSum
*/
package addsum;

import java.util.Scanner;


public class AddSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = 0;
        int input2 = 0;
        
        System.out.println("Enter a integer");
        input1 = in.nextInt();
        
        System.out.println("Enter another integer");
        input2 = in.nextInt();
        
        int sum = input1 + input2;
        int differ = input1 - input2;
        int product = input1 * input2;
        int quotient = input1 / input2;
        
        
        System.out.println("The two integer you have enter: " +input1 + " and " + input2);
        System.out.println("Sum is: " + sum);
        System.out.println("The difference is: " + differ);
        System.out.println("The product is: " + product);
        System.out.println("The quotient is: " + quotient);
                
        
        
        
    }
    
}
