package classwork_Jeff;

import java.util.Scanner;

public class WrongArrayOrder_Jeff {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int myArray[] = new int[10];
		
		for(int i = 0 ; i < 10; i++) {
			System.out.println("Please enter the "+ (i+1) +" number");
			myArray[i]= input.nextInt();
			
			
		}
		int count=10;
		while (count != 0) {
			
			
			System.out.println(myArray[count-1]);
			count--;
		}
		
		
	}
	
}
