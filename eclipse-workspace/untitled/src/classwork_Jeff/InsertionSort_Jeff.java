/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: Nov. 15th, 2017
  
*/
package classwork_Jeff;

import java.util.Arrays;

public class InsertionSort_Jeff {
	/*
	 * Insertion Sort Algorithm
	 * @param arr an unsorted array to be sorted
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public static void insertion_sort(int [] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			
			if (arr[i]> arr[i+1]) {
				
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				
			for (int j = i; j >=1; j--)
				
				if(arr[j-1]>arr[j]) {
					
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j] = temp;
					
				}
				
			}
			
			
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
			
			int [] unsorted = {5, 20, 1, 15, 2, 7};
			insertion_sort(unsorted);
			System.out.println(Arrays.toString(unsorted));
			
			
		}

}
