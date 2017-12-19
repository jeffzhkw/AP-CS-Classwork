/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: Nov. 14th, 2017
  
  This program is aimed to simulate a Binary Search in a dimension array using while loop.
*/

package classwork_Jeff;

public class BinarySearchInLoop_Jeff {
	
	public static int binary_search(int[] arr, int value) {
		int result = -1;	
		
		int low = 0;
		int high = arr.length-1;
		int mid = (low+high)/2;
		
		while(arr[mid] != value) {
			
		
		  while (arr[mid]< value) {
			 low = mid+1;
			 mid = (low+high)/2;
			 
		 }
		  while (arr[mid] > value) {
			  high = mid - 1;
			  mid = (low+high)/2;
			  
		  }
		
		
	}
		result = mid;
			return result;
	}
	
	public static void main(String[] args) {
		int search[] = {2, 5, 7, 8, 19, 22, 23, 32, 45, 51};
		
		System.out.print(binary_search(search , 23));
		
		
		
	}

}
