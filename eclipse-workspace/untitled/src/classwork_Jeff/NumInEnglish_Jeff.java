/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: October 24th, 2017
  
  This program is aimed to output the number in English.
*/

package classwork_Jeff;

import java.util.Scanner;

public class NumInEnglish_Jeff {
	
	public static String engNum(int i) {
		if (i == 0){
		return "";
		
		}
		if (i%10 == 1) {
			return engNum(i/10)+ "One";
		}
		
		else if (i%10 == 2) {
			return engNum(i/10)+ "Two";
		}

		else if (i%10 == 3) {
			return engNum(i/10)+"Three";
		}
		
		else if (i%10 == 4) {
			return engNum(i/10)+ "Four";
		}
		else if (i%10 == 5) {
			return engNum(i/10)+ "Five";
		}
		else if (i%10 == 6) {
			return engNum(i/10)+"Six";
		}
		else if (i%10 == 7) {
			return engNum(i/10)+ "Seven";
		}
		else if (i%10 == 8) {
			return engNum(i/10)+ "Eight";
		}
		else if (i%10 == 9) {
			return engNum(i/10)+ "Nine";
		}
		else if (i%10 == 0) {
			return engNum(i/10)+ "zero";
		}
		
		else {
			return "";
		}
		
	}

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number you want to find zeros");
		int g = input.nextInt();
		
		System.out.print(engNum(g));
	}
}
