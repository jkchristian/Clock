
package lab1shape;

/*
Christian Holz
Per 6
Lab 1 Shapes or First Program

 */
import java.io.*;
import java.util.Scanner;

public class Lab1Shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Width;
        int Height;
        //Small Box
        System.out.println("Enter the Width of a Box");
        Width = in.nextInt();
        System.out.println("Enther the Height of a Box");
        Height = in.nextInt();
            if(Width >= 15 || Height >= 15 ){
                System.out.println("Sorry your width or height is too big");
            }
            else if(Width <= 3 || Height <= 3){
                System.out.println("Sorry your width or height is too small");
            }
            else{
        for(int j=0; j<=Width; j++){
            System.out.println();
                 for(int i=0; i<=Height; i++){
                    System.out.print("*");
		}
	}
            }
        
        System.out.println("           ");
        
        int Oval;
        
        System.out.println("Enter the size of the oval");
        Oval = in.nextInt();
        
        if(1 == Oval){
            System.out.println("Your Oval is too small.");
        }
        else if(Oval == 2){
        System.out.println(" 00 ");
        System.out.println("0  0");
        System.out.println("0  0");
        System.out.println(" 00 "); 
        }
        else if(Oval == 3){
        System.out.println(" 000 ");
        System.out.println("0   0");
        System.out.println("0   0");
        System.out.println("0   0");
        System.out.println(" 000 ");
        }
        else if(Oval == 4){
        System.out.println("  00 ");
        System.out.println(" 0  0 ");
        System.out.println("0    0");
        System.out.println("0    0");
        System.out.println("0    0");
        System.out.println(" 0  0 ");
        System.out.println("  00 "); 
        }
        else if(Oval == 5){
        System.out.println("  000 ");
        System.out.println(" 0   0 ");
        System.out.println("0     0");
        System.out.println("0     0");
        System.out.println("0     0");
        System.out.println(" 0   0 ");
        System.out.println("  000 ");     
        }
        else if(Oval == 6){
        System.out.println("   00   ");
        System.out.println("  0  0  ");
        System.out.println(" 0    0 ");
        System.out.println("0      0");
        System.out.println("0      0");
        System.out.println("0      0");
        System.out.println(" 0    0 ");
        System.out.println("  0  0  ");
        System.out.println("   00   ");
        }
        else{
            System.out.println("Sorry the size you chouse for your oval is to big");
        }
        System.out.println("           ");
        //Arrow Pointing upwards
        int arrow;
        System.out.print("Enter the size of the arrow");
        arrow = inNextInt();
        for()
        System.out.println("           ");
        
        //Diamond
        
    /*  System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");
        System.out.println("  *****  ");
        System.out.println("   ***   ");
        System.out.println("    *    "); */
        
    }
    
}
