package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
		 Scanner input=new Scanner(System.in);

		System.out.printf("Enter the number of inches:");
		int Total_Inches=input.nextInt();

		int yards = Total_Inches/36;
		int inchesF=(Total_Inches%36);
		int feet = inchesF/12;
		int inchesT = inchesF%12;


		System.out.printf("Total number of yards:%d%n", + yards);
		System.out.printf("Total number of feet:%d%n", + feet);
		System.out.printf("Total number of inches:%d%n", + inchesT);
	}

}
