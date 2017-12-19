/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: October 24th, 2017
  
  This program is aimed to simulate factorial.
*/


package classwork_Jeff;

import java.util.Scanner;

public class NFactorial_Jeff {
	
	public static long nFactorial(int i) {
		
		if (i == 0) {
			
			return 1;
			
		}
		else {
			return nFactorial(i-1)*i;
		}
		
	}
		
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number you want to factorial");
		int i = input.nextInt();
		System.out.print(nFactorial(i));
	}
		

}
