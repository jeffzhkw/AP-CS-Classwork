package classwork_Jeff;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner; 

public class Insert6_Jeff {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number you want to insert: ");
		
		int n =input.nextInt();
		
		int [] a = {1,2,5,7,20,45,0,0,0};
		
		int [] result = new int[a.length+1];
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]< n) {
				
				result[i]=a[i];
			}
			
			else if (a[i] < n && n < a[i+1]) {
				
				result[i] = n;
				result[i+1] = a[i];
			}
			
			
		
		
		}
		System.out.print(Arrays.toString(result));
		
		
	}

}
