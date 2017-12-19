package homework_Jeff;

import java.util.Scanner;

public class ChooseYourOwnAdventure_2ndVer_Jeff {
	
	public static String genderSelection(int enter) {
		String gender ="";
		if (enter ==0 ) { //for male
			gender = "girlfriend";
		}
		
		else if(enter == 1) {//for female
			gender = "boyfriend";
		}
		return gender;
	}
	
	public static void subjectSelection(int enter) {
		if (enter ==0 ) { //for male
			System.out.print("his");
		}
		
		else if(enter == 1) {//for female
			System.out.print("her");
		}
	}
	
	public static void wait1s() {
		
		try{
			Thread.sleep(100);
			}catch(Exception e){
			System.exit(0);//退出程序
			}
		
	}
	
	public static void wait3s() {
		try{
			Thread.sleep(3000);
			}catch(Exception e){
			System.exit(0);//退出程序
			}
		
	}
	
	public static void typePeroid() {
		
		int count = 0;
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
	}
	
	public static void qust1o1(int enter) {
		
		String gender = genderSelection(enter);
		
		System.out.println("You dial your "+ gender+"'s number.");
		
		typePeroid();
		
		System.out.println("Nobody answer.");
		
		
	}
	
	public static void qust1o2(int enter) {
		
		String gender = genderSelection(enter);
		
		System.out.println("You put your phone back in your pocket. Patiently wait for your "+ gender+ " for another 5 minutes.");
		
		typePeroid();
	
		System.out.println("5 minutes passed. Your " + gender +" doesn't appear still.");
	}

	public static void ending() {
		System.out.print("T");
		wait1s();
		System.out.print("h");
		wait1s();
		System.out.print("a");wait1s();
		System.out.print("n");wait1s();
		System.out.print("k");wait1s();
		System.out.print(" ");wait1s();
		System.out.print("y");wait1s();
		System.out.print("o");wait1s();
		System.out.print("u");wait1s();
		System.out.print(" ");wait1s();
		System.out.print("f");wait1s();
		System.out.print("o");wait1s();
		System.out.print("r");wait1s();
		System.out.print(" ");wait1s();
		System.out.print("p");wait1s();
		System.out.print("l");wait1s();
		System.out.print("a");wait1s();
		System.out.print("y");wait1s();
		System.out.print("i");wait1s();
		System.out.print("n");wait1s();
		System.out.print("g");wait1s();
		System.out.print(" ");wait1s();
		System.out.print("J");wait1s();
		System.out.print("e");wait1s();
		System.out.print("f");wait1s();
		System.out.print("f");wait1s();
		System.out.print("'");wait1s();
		System.out.print("s");wait1s();
		System.out.print(" ");wait1s();
		System.out.print("g");wait1s();
		System.out.print("a");wait1s();
		System.out.print("m");wait1s();
		System.out.print("e");wait1s();
		System.out.print(".");wait1s();
		System.out.print(" ");wait1s();
		System.out.print("J");wait1s();
		System.out.print("e");wait1s();
		System.out.print("f");wait1s();
		System.out.print("f");wait1s();
		System.out.print(" ");wait1s();
		System.out.print("h");wait1s();
		System.out.print("o");wait1s();
		System.out.print("p");wait1s();
		System.out.print("e");wait1s();
		System.out.print("s");wait1s();
		System.out.print(" ");wait1s();
		System.out.print("y");wait1s();
		System.out.print("o");wait1s();
		System.out.print("u");wait1s();
		System.out.print(" ");wait1s();
		System.out.print("e");wait1s();
		System.out.print("n");wait1s();
		System.out.print("j");wait1s();
		System.out.print("o");wait1s();
		System.out.print("y");wait1s();
		System.out.print(" ");wait1s();
		System.out.print("i");wait1s();
		System.out.print("t");wait1s();
		System.out.print(".");wait1s();
	}
		
	public static void main(String[] args) {
		int lever1 = 1;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Jeff's Choose Your Own Adventrue game.");
		
			while ( lever1 == 1) {
		
											System.out.print("Please enter your name to proceed:");
			/*Beginning*/					String name = input.next();
											
			
											String gender = "";
											String subject ="";
											int enter = -1;
											
											while (enter == -1) {
											System.out.print("Please your gender to proceed(male or female):");
											String pGender = input.next();
											
											if (pGender.compareToIgnoreCase("male") == 0){ //for male
												gender = "girlfriend";
												subject ="his";
												enter = 0 ;
											}
											
											else if (pGender.compareToIgnoreCase("female") == 0) { // for female
												gender = "boyfriend";
												subject = "her";
												enter = 1;
											}
											
											else {
												System.out.println("You idiot. " + pGender + " is not a valid input");
												enter = -1;
											}
										}
		
											
				/*Game starts*/				System.out.print("Game is starting");
											
											typePeroid();
											
				/*Question1*/				System.out.println("Standing at a corner of a street, you can't wait to meet your "+ gender+".");
											
											wait3s();
											
											System.out.println("It's 10 minutes pass the meeting time, but you still can't see your "+ gender+".");
											
											wait3s();
											
											System.out.println("Today is your first time to date with your "+ gender+".");
											
											wait3s();
											
											System.out.println("You take out your phone, considering whether to call your "+ gender+" or not.");
											
											wait3s();
											
											System.out.println("Call your "+gender+ "----------------->1");
											System.out.println("Wait another five minutes------------>2");
											
											
											System.out.print("Your decision:");
											int question1 = input.nextInt();
											
											if (question1 == 1) {
											
												qust1o1(enter);
												
											}
											if (question1 == 2) {
												qust1o2(enter);
											
											}
											
				/*ending*/					wait3s();
											
											System.out.println("Suddently, you open up your eyes, realizing what just experienced was a dream.");
											
											wait3s();
											
											System.out.println("'How can I get a "+ gender +" in my entire life.'");
											
											wait3s();
											
											System.out.println(name + " thinks such words in "+subject+" mind.");
											
											wait3s();
											
											System.out.println("Gameover!"); //Game ends
											
											wait3s();
											
		System.out.println("Enter 1 to restart the game.");
		System.out.println("Enter 0 to quit the game.");
		lever1 = input.nextInt();
		System.out.println();
			}//end while
			
			ending();
			
	}//end main method
	

}
