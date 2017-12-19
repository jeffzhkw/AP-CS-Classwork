/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: Oct. 25th, 2017
  
  This program is aimed to simulate a Binary Search.
*/
package classwork_Jeff;

import java.util.Scanner;

public class BinarySearch_Jeff {
	
	public static int[] numbers = {1,4,7,8,10,15};//numbers should be integers and should be sorted. 
	
	public static int binSearch(int target, int lowerindex, int upperindex) {
		int arrayLength = upperindex+1;
		
		if (lowerindex == upperindex) {
			
			if (target == numbers[lowerindex]) {
				return lowerindex;
			}
			else
				return -1;
		}//base case No.1
		
		int midindex = (upperindex+lowerindex)/2;
		
		if (target == numbers[midindex]) {
			return midindex;
		}
			
		else if (target < numbers[midindex]) {
				
			return binSearch(target, lowerindex, midindex-1);//!!!!!
			
			}
		else if (target > numbers[midindex]) {
				
			return binSearch(target, midindex+1, upperindex);
		}
		
		/*if (target  <= (numbers[(upperindex+1)/2])) {
			
			
			return binSearch(target, lowerindex, upperindex/2);
			
		}
		
		else if (target > numbers[(upperindex+1)/2]) {
			
			return binSearch(target, (upperindex)/2, upperindex);
			
		}*/
		else 
			return -1;
		
		
		 //return the index of target in array list. 
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number you want to find: ");
		int target = input.nextInt();
		System.out.println("Please enter the lower index: ");
		int lowerindex = input.nextInt();
		System.out.println("Please enter the upper index: ");
		int upperindex = input.nextInt();
		
		System.out.println(binSearch(target, lowerindex, upperindex));
		
		
	}

}
