/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: Nov. 14th, 2017
  
  This program is aimed to simulate a Linear Search in a two dimension array.
*/

package classwork_Jeff;

import java.util.Arrays;

public class LinearSearch_Jeff {
	
	
	
	
	public static int[] linear_search(int [] [] arr, int value) {
		
		int result[] = {0,0};
		
		for (int i = 0 ; i < arr.length; i++) {
			for( int j = 0; j < arr[i].length; j++) {
				
				if(arr[i][j] == value) {
					result [0]= i;
					result [1]= j;
				}
				
			}
				
		}
		
		//int x = arr.length; numbers of rows
		//int y = arr[0].length; numbers of item in that given row. 
		
		
		return result;
	}
	
	public static void main(String[] args) {
		int search [] [] = {{1,5},{2,3,22,4,7}};
		int result [] = linear_search(search, 4);
		
		System.out.print(Arrays.toString(result));
		
		
		
		
	}
	

}
