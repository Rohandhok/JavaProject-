package Ass;

import java.util.Scanner;

public class assignment11 {
	public static void main(String []args) {
		int n,a=0,b=0,c=1;
		Scanner Scan=new Scanner (System.in);
		System.out.println("Enter the value of n:");
		
		
		n=Scan.nextInt();
		System.out.println("Fibonacci Series:");
	     for (int i=1; i<=n; i++) {
	    	 a=b;
	    	 b=c;
	    	 c=a+b;
	    	 System.out.println(a+" ");
	     }
	    
		
		
	}

}
