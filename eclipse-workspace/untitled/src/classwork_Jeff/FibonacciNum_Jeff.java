/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: October 24th, 2017
  
  This program is aimed to output the number in Fibonacci array.
*/

package classwork_Jeff;

import java.util.Scanner;

public class FibonacciNum_Jeff {
	
	public static int fibonacciNum(int i) {
		
		if ( i ==1) {
			return 0;
		}
		
		else if (i ==2) {
			return 1;
			
		}
		else {
			return fibonacciNum(i-1)+fibonacciNum(i-2);
		}
		
	}

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int i = input.nextInt();
		System.out.print(fibonacciNum(i));
	}
	
}
