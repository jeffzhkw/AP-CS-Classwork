/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: Oct 23th, 2017
  
  This program is aimed to use a recursive method to prints "I miss you" n times and signs off "Love me" .
*/


package homework_Jeff;

import java.util.Scanner;

public class ForgetMeNot_Jeff {
	
	public static String iMissYou(int i) {
		if (i==0) {
			return "Love me.";
		}
		else {
		
		return  "I Miss You. \n"  + iMissYou(i-1);
		
		}
	}

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of times that you want to repeat:");
		
		int i = input.nextInt();
		System.out.println(iMissYou(i));
		
	}
}
