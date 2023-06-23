package Ass;

import java.util.Scanner;

public class assignment7 {
	
		
	
	
	public static void main(String []args) {
		float c=3.142f;
		Scanner scan=new Scanner(System.in);
		
		
		
		
		
		System.out.println("Enter the radius");
		float radius=scan.nextFloat();
		
//		float b=scan.nextFloat();
		
		double diameter  = 2*radius;
		
		double circumference=2*c*radius;
		
		System.out.println("Diameter of Circle"   +  diameter);
		System.out.println("circumference of circle"  +  circumference);
		
		
		
		
	}

}
