package Ass;

import java.util.Scanner;

public class assignmnet3 {
	public static void main (String []args)
	{
	
		 Scanner s=new Scanner(System.in);
		 
	     System.out.println("Enter a Ammount");
	     float princ=s.nextFloat();
	     
	     
	     System.out.println("Enter Rate");
	     float rate=s.nextFloat();
	     
	     System.out.println("Time in year");
	     int time=s.nextInt();
	     
	     
	     double compund = princ*(Math.pow((1+rate/100),time));
	     System.out.println("Total compund Interset"+ compund);
	     
	     s.close();
	
	
	
	}

}
