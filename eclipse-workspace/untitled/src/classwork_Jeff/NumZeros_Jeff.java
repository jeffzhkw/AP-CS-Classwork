package classwork_Jeff;

import java.util.Scanner;
/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: October 24th, 2017
  
  This program is aimed to output numbers of zeros in a number.
*/

public class NumZeros_Jeff {
	
	public static int numZeros(int i) {
		
		 if(i == 0) {
				
				return 1;
			}
		
		 else if (i <10) {
				return 0;
			}
		 
		
		 else if(i %10 == 0) {
			
		return numZeros(i/10)+1;
			
		}
		
		else  {
			
		return numZeros(i/10);
			
		}
		 
		
		
		
		
		
			
	}
		
		
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number you want to find zeros");
		int i = input.nextInt();
		
		System.out.print(numZeros(i));
		
		
	}

}
