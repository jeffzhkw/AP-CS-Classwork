/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: Sep 27th, 2017
  
  This program is aimed to create a "*" pyramid using nested loop 
*/

package homework_Jeff;

import java.util.Scanner;

public class LoopsPyramid_Jeff {
	
	public static void main(String[] args ) {
		
		Scanner input = new Scanner(System.in);
		int row = 0;
		int num = 0;
		int space = 0;
		
		
		//version 1
		/*
		for (row = 0; row < 6; row++) {
			
			for(num = 0; num <= row; num++) {
				
			System.out.print("*");
			
			}
			System.out.println("");
			}
		*/
		
		
		//version 2
		/*
		System.out.print("Please enter the number of '*' in the last line.");
		int entry = input.nextInt();
		
		for (row = 0; row < entry; row++) {
			
			for(num = 0 ; num <= row; num++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		*/
		
		
		//version 3
		/*
		System.out.print("Please enter the odd number of '*' in the last line.");
		int entry = input.nextInt();
		int totalRows = (entry + 1)/2;
		
		for (row = 1; row <= totalRows; row++) {	//determine rows
			
				for(space = 0; space < totalRows - row; space++) {
					System.out.print(" ");
				}
				
				for(num = 1; num <= (2*row)-1 ; num++) {
					System.out.print("*");
				}
			
			System.out.println("");    				//next line
		}
		*/
		
		
		//version 4, the perfect version.
		
		int lever = 0;
		
		while(lever == 0) {												//switch of whole program
			
		System.out.print("Please enter the odd number of '*' in the last line:");
		int lever1 = 0;
		while (lever1 == 0) {											//switch of mis-entering
			
		int entry = input.nextInt();
		
					if(entry%2 != 0) {
					int totalRows = (entry + 1)/2;
					
						for (row = 1; row <= totalRows; row++) {			//determine rows
							
								for(space = 0; space < totalRows - row; space++) {
									System.out.print(" ");				//print spaces
								}
								
								for(num = 1; num <= (2*row)-1 ; num++) {
									System.out.print("*");				//print dots
								}
							
							System.out.println("");    					//next line
						}	
						lever1 = 1;
					}//end if
					else {
						System.out.println("You idiot. " + entry + " is a even number.");
						System.out.print("Please re-enter the number of '*' in the last line: ");
					}
				}//end while lever1
			
			
				System.out.println("Program ended.");
				System.out.println("Enter 0 to re-enter the number of 'x'");
				System.out.println("Enter 1 to exit");
		lever = input.nextInt();
		
		}//end while lever
		System.out.println("Thank you for using Jeff's '*' Pyramid.");
		System.exit(0);
	}
}


