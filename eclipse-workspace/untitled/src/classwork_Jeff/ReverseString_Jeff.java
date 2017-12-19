package classwork_Jeff;

import java.util.Scanner;

public class ReverseString_Jeff {
	
	public static String revString(String a) {
		
		
		int length = a.length();
		if (length == 1) {
			return a;
		}
		else
		return a.substring(length-1)+ revString(a.substring(0, length-1));
	}
	
	public static int revInt(int n, int length) {
		
		
		if (n %10 == n) {
			return n;
		}
		else 
			return (int) ((n%10)* Math.pow(10.0, length-1) + revInt(n/10, length-1));
		
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number you want to reverse.");
		int n = input.nextInt();
		int a = input.nextInt();
		System.out.println("Result:");
		System.out.println(revInt(n, a));
		
	//	System.out.println(n.length());
		
		
	}
	

}
