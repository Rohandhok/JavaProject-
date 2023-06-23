package Ass;

import java.util.Scanner;

public class assignment5 {
	public static void main(String []args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		
		int a=scan.nextInt();
		System.out.println("Enter the 2nd Number");
		int b=scan.nextInt();
		
		System.out.println("Before Swap Number a ="+ a + "b=" +b);
		
		int thirdnumber = a;
		              a = b;
		              b = thirdnumber;
		              
		              
//		System.out.println(thirdnumber);
		              
		System.out.println("after Swap Number a ="+ a + "b=" +b);
		              
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		
		
		
	}

}
