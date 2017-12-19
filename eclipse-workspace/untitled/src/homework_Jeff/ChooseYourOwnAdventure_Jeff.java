/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: October 10th, 2017
  
 This program is aimed to tell a "Choose your own adventure story".
*/

package homework_Jeff;

import java.util.Scanner;

public class ChooseYourOwnAdventure_Jeff {
	
	public static void main(String[] args) {
		int count = 0;
		int lever1 = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Jeff's Choose Your Own Adventrue game.");
		
			while ( lever1 == 1) {
		
											System.out.print("Please your name to proceed:");
											String name = input.next();
											
											String gender = "";
											String subject ="";
											
											while (gender == "") {
											System.out.print("Please your gender to proceed(male or female):");
											String pGender = input.next();
											
											if (pGender.compareToIgnoreCase("female") == 0) {
												subject = "her";
												 gender = "boyfriend";
											}
											else if (pGender.compareToIgnoreCase("male") == 0){
												subject = "his";
												 gender = "girlfriend";
											}
											else {
												System.out.println("You idiot. " + pGender + " is not a valid input");
												gender = "";
											}
											}
		
											
				/*Game starts*/				System.out.print("Game is starting");
											while( count<=4) {
												System.out.print(".");
											try{
												Thread.sleep(1000);
												}catch(Exception e){
												System.exit(0);//退出程序
												}
											count++;
											}
											System.out.println();
											System.out.println("Standing at a corner of a street, you can't wait to meet your "+ gender+".");
											try{
												Thread.sleep(3000);
												}catch(Exception e){
												System.exit(0);//退出程序
												}
											System.out.println("It's 10 minutes pass the meeting time, but you still can't see your "+ gender+".");
											try{
												Thread.sleep(3000);
												}catch(Exception e){
												System.exit(0);//退出程序
												}
											System.out.println("Today is your first time to date with your "+ gender+".");
											try{
												Thread.sleep(3000);
												}catch(Exception e){
												System.exit(0);//退出程序
												}
											System.out.println("You take out your phone, considering whether to call your "+ gender+" or not.");
											try{
												Thread.sleep(3000);
												}catch(Exception e){
												System.exit(0);//退出程序
												}
											
											System.out.println("Call your "+gender+ "----------------->1");
											System.out.println("Wait another five minutes------------>2");
											
											
											System.out.print("Your decision:");
											int lever = input.nextInt();
											
											if (lever == 1) {
												System.out.println("You dial your"+ gender+"'s number.");
												count = 0;
												while( count<=4) {
													System.out.print(".");
												try{
													Thread.sleep(1000);
													}catch(Exception e){
													System.exit(0);//退出程序
													}
												count++;
												}
												System.out.println();
												System.out.println("Nobody answer.");
												
											}
											if (lever == 2) {
												System.out.println("You put your phone back in your pocket. Patiently wait for your "+ gender+ " for another 5 minutes.");
												count = 0;
												while( count<=4) {
													System.out.print(".");
												try{
													Thread.sleep(1000);
													}catch(Exception e){
													System.exit(0);//退出程序
													}
												count++;
												}
												System.out.println("5 minutes passed. Your " + gender +" doesn't appear still.");
											
											}
											try{
												Thread.sleep(3000);
												}catch(Exception e){
												System.exit(0);//退出程序
												}
											System.out.println("Suddently, you open up your eyes, realizing what just experienced is a dream.");
											try{
												Thread.sleep(3000);
												}catch(Exception e){
												System.exit(0);//退出程序
												}
											System.out.println("'How can I get a "+ gender +" in my entire life.'");
											try{
												Thread.sleep(3000);
												}catch(Exception e){
												System.exit(0);//退出程序
												}
											System.out.println(name + " thinks such words in "+subject+" mind.");
											try{
												Thread.sleep(3000);
												}catch(Exception e){
												System.exit(0);//退出程序
												}
											System.out.println("Gameover!"); //Game ends
											try{
												Thread.sleep(3000);
												}catch(Exception e){
												System.exit(0);//退出程序
												}
		System.out.println("Enter 1 to restart the game.");
		System.out.println("Enter 0 to quit the game.");
		lever1 = input.nextInt();
			}//end while
			System.out.println("Thank you for playing Jeff's game. Jeff hopes you enjoy it.");
			
	}
		

}

