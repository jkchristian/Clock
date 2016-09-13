/*
Christian Holz
Lab 2 BMI
Per 6
*/
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Lab2BMI {

    
    public static void main(String[] args) {
        DecimalFormat num = new DecimalFormat(".00");
        Scanner in = new Scanner(System.in);
        double BMI = 0;
        double Weight;
        double Height;
        
        System.out.println("Please enter your weight in pounds");
        Weight = in.nextInt();
        System.out.println("Please enter your height in inches");
        Height = in.nextInt();
        
        BMI = (Weight * 703)/(Height * Height);
        
        if(BMI <= 18.5){
            System.out.println("You are underweight");
            System.out.println("BMI is: " + num.format(BMI));
        }
        else if(BMI <= 18.5 || BMI <= 25){
            System.out.println("You are Normal");
            System.out.println("BMI is: " + num.format(BMI));
        }
        else if(BMI <= 25 || BMI <= 30){
            System.out.println("You are Overweight");
            System.out.println("BMI is: " + num.format(BMI));
        }
        else {
            System.out.println("You are Obese");
            System.out.println("BMI is: " + num.format(BMI));
        }
    
        
    }
    
}
