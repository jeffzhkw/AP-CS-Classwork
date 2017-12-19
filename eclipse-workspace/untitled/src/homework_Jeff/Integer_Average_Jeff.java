/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Danial
 
 Date: Sep 19th, 2017
  
  This program is aimed to calculate the average of five number
*/

package homework_Jeff;

import java.util.Scanner;

public class Integer_Average_Jeff {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		int sum = input.nextInt();
		
		System.out.print("Please enter the second number: ");
		sum = sum + input.nextInt();
		
		System.out.print("Please enter the third number: ");
		sum = sum + input.nextInt();//sum +=
		
		System.out.print("Please enter the fourth number: ");
		sum = sum + input.nextInt();
		
		System.out.print("Please enter the fifth number: ");
		sum = sum + input.nextInt();
		
		double average = sum/5.0;
		
		System.out.println("The average of five numbers is "+ average);
	}
	

}
