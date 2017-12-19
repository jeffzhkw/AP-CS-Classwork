/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: Sep 25th, 2017
  
  This program is aimed to find future ideal and appropriate partner.
*/

package homework_Jeff;

import java.util.Scanner;

public class FuturePartner_Jeff {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int myAge = 17;
		int myHeight = 185;
		
		System.out.print("Please enter your gender: ");
		String gender = input.next();
		
		System.out.print("Please enter your age: ");
		int age = input.nextInt();
		
		System.out.print("Please enter your height in centimeters: ");
		int height = input.nextInt();
		
		System.out.println("Do you have a long hair? ");
		String hair = input.next();
		
		
		System.out.println("In a scale form 1 to 10, please rate your appearance. ");
		int rate = input.nextInt();
		
		System.out.println("Would you feel uncomfortable while talking to me?");
		String answer1 = input.next();
		
			
		Boolean a = 
				gender.compareToIgnoreCase("female") == 0 &&
				hair.compareToIgnoreCase("Yes") == 0 && 
				answer1.compareToIgnoreCase("No") == 0 &&	
				Math.abs(myAge - age) <= 3 && 
				myHeight - height <= 25 &&
				rate >= 7;
		
		if ( a ) {
			
			System.out.println("You are my ideal partner.");
			
			try{
				Thread.sleep(1000);
				}catch(Exception e){
				System.exit(0);//退出程序
				}
			
			System.out.println("Would you merry me? ");
			String answer = input.next();
			if (answer.compareToIgnoreCase("Yes") == 0) {
				System.out.print("Nice to have you by my side, sweetheart.");
			}
			else {
				System.out.println("Hope you can find your soulmate.");
			}
			
		}
		else {
			
			System.out.println("We might not fit so well.");
			
			try{
				Thread.sleep(1589);
				}catch(Exception e){
				System.exit(0);//退出程序
				}
			
			System.out.println("I hope you can find your soulmate.");
			
		}
		
	}
	
}
