package classwork_Jeff;

import java.util.Arrays;

public class SortArray_Jeff {
	//sort array a
	public static void mergeSort(int[] a) {
		//base case
		if(a.length == 1)
			return;
		//split the array
		
		int [] front = new int[a.length/2];
		
		int [] tail = new int[(a.length+1)/2];
		
		int hi =0;
		int ti=0;
			for (int i =0; i<a.length;i++) {
				if(i<(a.length/2)) {
					front[hi++] = a[i];
				}
				else tail[ti++] = a[i];
			}
		//recursively sort both splits 
			mergeSort(front);
			mergeSort(tail);
			
				//merge
			hi = 0;
			ti = 0;
		for (int i =0; i<a.length; i++) {
			if (hi == front.length) {
				a[i] = tail[ti++];
			}
			
			else if (ti == tail.length) {
				a[i] = front[hi++];
			}
			else if (front[hi]<tail[ti]) {
				a[i]=front[hi++];
			}
			else
				a[i] = tail[ti++];
		}
	}
	
		
	
	
	public static void main(String[] args) {
		
		int [] numbers = {11,21,1,5,92};
		
		System.out.println(Arrays.toString(numbers));
		
		mergeSort(numbers);
		
		System.out.println(Arrays.toString(numbers));
	}

}
