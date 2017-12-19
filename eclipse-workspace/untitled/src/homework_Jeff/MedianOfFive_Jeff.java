package homework_Jeff;

import java.util.Scanner;
import java.util.Arrays; 

public class MedianOfFive_Jeff {
	
	//Version 1
	public static void median(int a, int b, int c) {
			
			
			int temp1 = Math.max(a, b);
			int temp2 = Math.max(a, c);
			int temp3 = Math.max(b, c);
			
			
			while (temp1 == temp2) {
				//int max = a;
				int median = Math.max(b, c);
				
				System.out.println(median);
				System.exit(0);
			}
			while (temp1 == temp3) {
				
				//int max = b;
				int median = Math.max(a, c);
				System.out.println(median);
				System.exit(0);
			}
			
			while (temp2 == temp3) {
				
				//int max = c;
				int median = Math.max(a, b);
				System.out.println(median);
				System.exit(0);
				
			}

			
		}
	
		//Version 2
		public static int median(int a, int b, int c, int d, int e) {
			
			
			
			
			int median = 0 ;
			int temp1 = Math.max(a, b);
			int temp2 = Math.max(a, c);
			int temp3 = Math.max(a, d);
			int temp4 = Math.max(a, e);
			
			int temp5 = Math.max(b, c);
			int temp6 = Math.max(b, d);
			int temp7 = Math.max(b, e);
			
			int temp8 = Math.max(c, d);
			int temp9 = Math.max(c, e);
			
			int temp10 = Math.max(d, e);
			
			
			while (temp1 == temp2 && temp2 == temp3 && temp3 == temp4) {//max is a 
				
				
				
			}
			
			while (temp1 == temp5 && temp5 == temp6 && temp6 == temp7) {//max is b
				
				
				
			}
			while (temp8 == temp9 && temp9 == temp2 && temp2== temp5) {//max is c
				
				
				
			}
			while (temp3 == temp6 && temp6 == temp8 && temp8 == temp10) {//max is d
				
				
				
			}while (temp4 == temp7 && temp7 == temp9 && temp9 == temp10) {//max is e
				
				
				
			}
			
			
			
			
			return median;
			
		}
		
		
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the first integer");
			int a = input.nextInt();
			System.out.print("Enter the second integer");
			int b = input.nextInt();
			System.out.print("Enter the third integer");
			int c = input.nextInt();
			
			median(a, b, c);
			
			
		}
}
