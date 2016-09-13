/*
Christan Holz
Lab 2 Grades
Per 6
*/
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab2Grades {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat num = new DecimalFormat(".");
        
        double totaltest;
        double studentpoints;
        
        System.out.println("Please enter the score you got from your test");
        studentpoints = in.nextDouble();
        System.out.println("Plese enter the total score of the test");
        totaltest = in.nextDouble();
        
        //math 
        
        double test = ((studentpoints / totaltest)* 100);
        
        if(test >= 90){
            System.out.println("Good Job You Got the A");
            System.out.println("Test Percentage is: " + num.format(test));  
        }
        else if(test >=80){
            System.out.println("Nice Job You got the B");
            System.out.println("Test Percentage is: " + num.format(test)); 
        }
        else if(test >= 70){
            System.out.println("Nice Try, You Got a C");
            System.out.println("Test Percentage is: " + num.format(test)); 
        }
        else if(test >= 60){
            System.out.println("You might need to try hard, you got a D");
            System.out.println("Test Percentage is: " + num.format(test)); 
        }
        else {
            System.out.println("Hey with this letter grade you are going to failed this class");
            System.out.println("You got a D, do better next time. Study more and get help");
            System.out.println("Test Percentage is: " + num.format(test)); 
        }
        
    }
    
}
