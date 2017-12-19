/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: October 11th, 2017
  
  This program is aimed to output the number of each type of coins of an input amount of money from 1 to 100
*/

package homework_Jeff;

import java.util.Scanner;

public class CoinChanger_Jeff {
	
	public static void coinChanger(int amount){
		
		//halfDollar = 50;
		//quarters = 25;
		//dimes = 10;
		//nickels = 5;
		//pennies = 1;
		
		int dollarCount = 0;
		int quartersCount = 0;
		int dimesCount = 0;
		int nickelsCount = 0;
		int penniesCount = 0;
		
		if (100 >= amount && amount >=1) {
			
				while (100 >= amount && amount >= 50) {
					
					amount = amount -50;
					dollarCount++;
				}
				
				while (50 >= amount && amount >= 25) {
					
					amount = amount - 25;
					quartersCount++;
				}
				
				while (25 >= amount && amount >= 10) {
							
							amount = amount - 10;
							dimesCount++;			
				}
				
				while (10 >= amount && amount >= 5) {
							
							amount = amount - 5;
							nickelsCount++;	
				}
				
				while (5 >= amount && amount >= 1) {
					
					amount = amount - 1;
					penniesCount++;
				}
		
				System.out.println("number of half dollar--------"+dollarCount);
				System.out.println("number of quarter------------"+quartersCount);
				System.out.println("number of dimes--------------"+dimesCount);
				System.out.println("number of nickels------------"+nickelsCount);
				System.out.println("number of pennies------------"+penniesCount);
				
		}//end outer if
		else {
			System.out.println("You idiot. "+ amount + " is not a valid input.");
		}
		
		
	}//end coinChange method

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the amount of money you have from 1 to 100:");
		int enter = input.nextInt();
		coinChanger(enter);
		
	}

}
