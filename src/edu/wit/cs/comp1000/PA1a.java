package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		 Scanner input=new Scanner(System.in);
		 
		 int inches,feet,yards;
		 int Final_Inches;
		 System.out.printf("Enter the number of yards: ");
		 yards=input.nextInt();
		 System.out.printf("Enter the number of feet: ");
		 feet=input.nextInt();
		 System.out.printf("Enter the number of inches: ");
		 inches=input.nextInt();
		
		
		 
		
		  
		  Final_Inches=(inches + feet*12 + yards*36);
		  System.out.printf("Total number of inches: %d%n",Final_Inches);
	}

}
