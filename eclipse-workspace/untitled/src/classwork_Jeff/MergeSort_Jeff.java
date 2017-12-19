/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: Nov. 16th, 2017
  
*/
package classwork_Jeff;

import java.util.Arrays;

public class MergeSort_Jeff {
	//sort array a
		public static void mergeSort(int[] arr) {
			//base case
			if(arr.length == 1)
				return;
			
			
			//split the array
			
			int [] front = new int[arr.length/2];
			
			int [] tail = new int[(arr.length+1)/2];
			
			int hi =0;
			int ti=0;
			
				for (int i =0; i<arr.length;i++) {
					if(i < (arr.length/2)) {
						front[hi++] = arr[i];
					}
					else tail[ti++] = arr[i];
				}
				
			//recursively sort both splits 
				mergeSort(front);
				mergeSort(tail);
				
					//merge
				hi = 0;
				ti = 0;
			for (int i =0; i<arr.length; i++) {
				if (hi == front.length) {
					arr[i] = tail[ti++];
				}
				
				else if (ti == tail.length) {
					arr[i] = front[hi++];
				}
				else if (front[hi]<tail[ti]) {
					arr[i]=front[hi++];
				}
				else
					arr[i] = tail[ti++];
			}
		}
		
			
		
		
		public static void main(String[] args) {
			
			int [] numbers = {11,21,1,5,92};
			
			System.out.println(Arrays.toString(numbers));
			
			mergeSort(numbers);
			
			System.out.println(Arrays.toString(numbers));
		}

		

}
