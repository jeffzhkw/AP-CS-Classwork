/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: Nov. 15th, 2017
  
*/
package classwork_Jeff;

import java.util.Arrays;

public class SelectionSort_Jeff {
	
	/*
	 * Selection Sort  Algorithm
	 * @param arr an unsorted array to be sorted
	 * 
	 * 
	 * 
	 * 
	 */
	public static void selection_sort(int [] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i; j < arr.length; j++) {
				
				if (arr[j]<arr[i]) {
					
					int min = arr[j];
					
					if (arr[j]< min)	{
						min = arr[j];
					}
					
					int temp = arr[i]; //swap value
					arr[i] = min;
					arr[j] = temp;	
				}
					
				
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int [] unsorted = {5, 20, 1, 15, 2, 7};
		selection_sort(unsorted);
		System.out.println(Arrays.toString(unsorted));
		
		
	}

}
