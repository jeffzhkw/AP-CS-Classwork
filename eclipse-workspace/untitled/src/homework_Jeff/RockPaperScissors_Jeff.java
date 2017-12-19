/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: Sep 20th, 2017
  
  This program is aimed to play Rock Paper Scissors with computer.
*/
package homework_Jeff;

import java.util.Scanner;


public class RockPaperScissors_Jeff {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("0 represents rock.");
		System.out.println("1 represents paper.");
		System.out.println("2 represents scissors.");
		
		System.out.print("Please make your decision: ");
		int human = input.nextInt();
		
		if (human != 0 && human != 1 && human !=2) {
			System.out.println("Invaild input.");
			System.exit(0);
		}
		
		
		int computer = (int)(Math.random() * 3); 
		
		
		if(human == computer) {
			System.out.println("Tie.");
		}
		
		else {
			if(	
			   (human == 0 && computer == 1)||
			   (human == 1 && computer == 2)||
			   (human == 2 && computer == 0)
			  ) 
			{
				System.out.println("Computer Wins.");
			}
			
			else if(
					(human == 1 && computer == 0)||
					(human == 2 && computer == 1)||
					(human == 0 && computer == 2)
			       )
			{
				System.out.println("Human Wins.");
			}
			
			
			
		}
		System.out.print("The decision of computer is " + computer);
	}

}
