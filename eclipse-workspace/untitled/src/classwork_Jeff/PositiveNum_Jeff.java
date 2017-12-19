package classwork_Jeff;

import java.util.Scanner;

public class PositiveNum_Jeff {
	
	public static int positiveNum(int i) {
		Scanner input = new Scanner(System.in);
		if(i>0) {
			System.out.println("Good. "+ i+ " is a valid input.");
			
		}
		
		else{
			System.out.println("You idoit, "+ i + " is not a valid input.");
			System.out.println("Please enter a positive integer again:");
			i = input.nextInt();
			positiveNum(i);
			
		}
		return i;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a positive integer: ");
		int i = input.nextInt();
		positiveNum(i);
		
		
	}

}
