/*
Christian Holz
Lab 2 Odd Even
Per 6
*/
import java.io.*;
import java.util.Scanner;

public class Lab2OddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputInt;
		
        System.out.println("Type in your integer to find if it is a odd integer or even integer.");
        inputInt = scanner.nextDouble();
		
	if(inputInt % 2 == 0)
            System.out.println("Your interger is even");
	if(inputInt % 2 != 0)
            System.out.println("Your interger is odd");
    }
    
}
