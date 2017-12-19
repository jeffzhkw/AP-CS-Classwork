/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: Sep 26th, 2017
  
  This program is aimed to simulate an functional ATM .
*/


package homework_Jeff;

import java.util.Scanner;

public class ATM_WhileLoop_Jeff {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int answer = 0;
		double deposite = 2500.25;
		
		while(answer == 0) {
		
				System.out.println("Welcome! Enter the number for your transaction.");
				System.out.println("Withdraw cash: 		1");
				System.out.println("Make a deposite: 	2");
				System.out.println("Check your balance: 	3");
				System.out.println("Exit: 			4");
				System.out.print("Please Enter the number: ");
				
				answer = input.nextInt();
							
							switch (answer) {
						case 1:
							System.out.print("Please enter the amount you want to withdraw:");
							double entry1 = input.nextDouble();
							if (entry1 <= deposite) {
							deposite = deposite - entry1;
							System.out.println("Please imagine you have took the paper money from ATM.");
							System.out.println("You now have $" + deposite +"in your account.");
								}
							else {
								System.out.println("You don't have that much in your account.");
								}
							answer = 0;
						    break;
						     
						case 2: 
							System.out.println("Please enter the amount you want to deposite.");
							double entry2 = input.nextDouble();
							deposite = deposite + entry2;
							System.out.println("Please imagine you have put the paper money into ATM.");
							System.out.println("You now have $" + deposite +"in your account.");
							answer = 0;
							break;
							
						case 3:
							System.out.println("You now have $" + deposite +"in your account.");
							answer = 0;
							break;
							
						case 4:
							System.out.println("Thank you for using Jeff's ATM.");
							break;
							
						default:
							System.out.println("Invalid input");
							answer = 0;
							}//end switch	
						
		}//end while	
		
	}//end main method
}//end class