package Ass;

import java.util.Scanner;

public class assignment10 {
   public static void main(String []args) {
	   Scanner scan =new Scanner(System.in);
	   
	   System.out.println("Enter the 1st Number");
	   int x=scan.nextInt();
	   System.out.println("Enter the 2nd Number");
	   int y=scan.nextInt();
	   
	   System.out.println("Before Swapp value of x " + x +"value of y "+ y);
	   
	   
	    x = x+y;
	    y = x-y;
	    x = x-y;
//	   System.out.println(x);
//	   System.out.println(y);
	   System.out.println("After Swapp value of x " + x +"value of y "+ y);
   }
}
