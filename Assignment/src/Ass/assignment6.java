package Ass;

import java.util.Scanner;

public class assignment6 {
	public static void main(String []args ) {
		
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the length");
		
		float length =a.nextFloat();
		
		System.out.println("Enter the Width");
		float width=a.nextFloat();
		
		 float area=length*width;
		
		
		System.out.println("Area of the rectangle    \n" +area);
		
		
		
	}
	

}
