/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: October 6th, 2017
  
  This program is aimed to output a reverse integer of an input integer.
*/

package homework_Jeff;

import java.util.Scanner;

public class myFirstApp_Jeff {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Welcome to Jeff's 1st application.");
		System.out.println("This program is aimed to output a reverse integer of an input integer.");
		
		System.out.println("Enter 0 to continue.");
		System.out.println("Enter 1 to exit.");
		
		int lever = input.nextInt();
		
		while (lever == 0) {
		
		System.out.println("Please enter a integer that you want to reverse: ");
		int reverse = 0;
		int num = input.nextInt();
		
		while (num!=0) {
			
		
		reverse = reverse * 10;
		reverse = reverse + num % 10;
		num = num / 10;
		
		
		}
		System.out.print("The reverse order of the integer is ");
		System.out.println(reverse);
		
		
		System.out.println("Enter 0 to continue.");
		System.out.println("Enter 1 to exit.");
		lever = input.nextInt();
		}
		System.out.println("Thank you for using Jeff's application");
	}
	
}
