/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: Sep 28th, 2017
  
  This program is aimed to simulate an electrical class grade book.
*/

package homework_Jeff;

import java.util.Scanner;

public class ClassGrade_Jeff {

	public static void main(String[] args) {
		
		int lever = 0;
		Scanner input = new Scanner(System.in);
		Double sum = 0.0;
		
		//version 1
		/*
		  System.out.println("Please enter the number of students: ");
		 
		int numStd = input.nextInt();
		System.out.println("Please enter the number of Assignments: ");
		int numAsg = input.nextInt();
		
		for (int s = 1; s <= numStd; s++) {
			
			System.out.println("For student" + s+ ":");
			
			for(int a = 1; a <= numAsg ;a++) {
				
				System.out.print("Please enter the score of the " + a +" assignment: ");
				sum = sum + input.nextDouble();
				
			}
			System.out.println("The average score is "+ (sum)/numAsg);
			sum = 0.0;
		}
		*/
		
		
		//version 2
		System.out.println("Please enter the number of students: ");
		int numStd = input.nextInt();
		System.out.println("Please enter the number of Assignments: ");
		int numAsg = input.nextInt();
		
		for (int s = 1; s <= numStd; s++) {
			
			System.out.println("For student" + s+ ":");
			
			for(int a = 1; a <= numAsg ;a++) {
				
				System.out.print("Please enter the score of the " + a +" assignment: ");
				
					double grade = input.nextDouble();
					
					if (grade <=100 && grade>=0) {
						sum = sum + grade;
					}
					
					else if ( grade == -1) {
						
						System.out.println("The average score is "+ (sum)/(numAsg-1));
						System.out.println("");
						System.exit(0);
					}
					
					else {
						System.out.println("You idiot. " + grade +" is not a valid input.");
						System.out.print("Please re-enter the score of the " + a +" assignment: ");
						grade = input.nextDouble();
						sum = sum + grade;
					}//end if 
					
				}
			System.out.println("The average score is "+ (sum)/numAsg);
			sum = 0.0;
			}
				
			
		}
	}
	

