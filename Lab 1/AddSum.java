/* Christian Holz
Per 6
Lab 1 AddSum
*/


import java.io.*;
import java.util.Scanner;


public class AddSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float input1;
        float input2;
        float sum = 0;
        float differ = 0;
        float product = 0;
        float quotient = 0;
        int choice = 0;
        System.out.println("Enter a integer");
        input1 = in.nextInt();
        
        System.out.println("Enter another integer");
        input2 = in.nextInt();
        

        sum = input1 + input2;
        differ = input1 - input2;
        product = input1 * input2;

        
        
        System.out.println("The two integer you have enter: " +input1 + " and " + input2);
        System.out.println("Sum is: " + sum);
        System.out.println("The difference is: " + differ);
        System.out.println("The product is: " + product);

        if(input1 == 0){
            choice = choice;
        }else if(input2 == 0){
            choice = choice;
        }else if(input1 != 0){
            choice = choice + 1;
        }else{
            choice = choice + 1; 
        }

        if(choice == 0 ){
            if(input1 == 0){
               quotient = 0; 
               System.out.println("There is no quotient because you can't divide a 0");
           }else if (input2 == 0){
                quotient = 0; 
                System.out.println("There is no quotient because you can't divide a 0");
           }
        } else if(choice == 1){
            if(input1 != 0){
            
                quotient = input1 / input2;
                System.out.println("The quotient is: " + quotient);
            } else if(input2 != 0){
                quotient = input1 / input2;
                System.out.println("The quotient is: " + quotient);
            }
        }
                
        
        
        
    }
    
}
