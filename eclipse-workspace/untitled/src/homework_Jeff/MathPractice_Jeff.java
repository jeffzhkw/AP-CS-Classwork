package homework_Jeff;

import java.util.Scanner;

public class MathPractice_Jeff {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Question 1 
		
		System.out.println("Question 1");
		
		System.out.print("Please enter value of x in first question: ");
		
		double x = input.nextDouble();
		
		double result1 = Math.pow(x, 2) + 5 * x - 7;
		
		System.out.println("The result of first question is "+ result1);
		
		//Question 2 
		
		System.out.println("Question 2");
		
		System.out.print("Please enter value of x in second question: ");
		
		x = input.nextDouble();
		
		double result2 = 10 * Math.pow(x, 3) + 5 * Math.pow(x, 2) - x + 100;
		
		System.out.println("The result of second question is "+ result2);
		
		//Question 3
		
		System.out.println("Question 3");
		
		System.out.print("Please enter value of x in third question: ");
		
		x = input.nextDouble();
		
		double result3 = Math.pow(x, 1/5) + 2 * Math.sqrt(x);
		
		System.out.println("The result of third question is "+ result3);
		
		//Question 4
		
		System.out.println("Question 4");
		
		System.out.println("Please enter the axis of point a: ");
		System.out.print("X: ");
		double xa = input.nextDouble();
		System.out.print("Y: ");
		double ya = input.nextDouble();
		
		System.out.println("Please enter the axis of point b: ");
		System.out.print("X: ");
		double xb = input.nextDouble();
		System.out.print("Y: ");
		double yb = input.nextDouble();
		
		double result4 = Math.sqrt(Math.pow(xa-xb,2) + Math.pow(ya-yb, 2));
		System.out.println("The result of fourth question is "+ result4);
		
		//Question 5
		
		System.out.println("Question 5");
		
		System.out.print("Please enter the length of side a: ");
		double a = input.nextDouble();
		System.out.print("Please enter the length of side b: ");
		double b = input.nextDouble();
		
		double result5 = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
		
		System.out.println("The result of fifth question is "+ result5);
		
		//Question 6
		
		System.out.println("Question 6");
		
		System.out.print("Please enter the value of x: ");
		x = input.nextDouble();
		System.out.print("Please enter the value of y: ");
		double y = input.nextDouble();
		
		double result6 = (Math.pow(x,2) + Math.pow(y, 2))/(7*x);
		
		System.out.println("The result of sixth question is "+ result6);
		
		//Question 7
		
		System.out.println("Question 7");
		
		System.out.print("Please enter the value of x: ");
		x = input.nextDouble();
		System.out.print("Please enter the value of y: ");
	    y = input.nextDouble();
	    
	    double result7 = Math.sqrt((Math.pow(x,2) + 3 * Math.pow(x, 3))/(2*x*y));
	    
	    System.out.println("The result of seventh question is "+ result7);
		
	    //Question 8 
	    
	    
		System.out.println("Question 8");
	    
	    System.out.print("Please enter the value of x: ");
		x = input.nextDouble();
		
		double result8 = 2 * x + Math.sqrt(x / 2)
		;
		 System.out.println("The result of eighth question is "+ result8);
		 
		 
	
		 
		 
		
		
	}

}
