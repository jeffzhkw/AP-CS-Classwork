/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: Oct. 25th, 2017
  
  This program is aimed to ......
*/

package untitled;

//Menu


import java.util.*;

public class HelloCSClass {

	public static void main(String[] args) {
		
		System.out.println(34%10);
		
		//Sep.7th, 2017
		
		//String my_Name = "Jeff";
		//System.out.println("My name is " + my_Name);
		
		
		//double radius = 4.5;
		//final double pi = 3.1415926535798;
		//double circ = 2 * pi * radius;
		
		//double area = pi * radius * radius;
		
		//System.out.println("The circumference is "+ circ);
		//System.out.println("The area is "+ area);
		
		//double score = 1.0 - 0.9; 
		//System.out.println("The score is "+ score);
		
		//(3+4x)/5 "- (10*(y-5)(a+b+c))/x + 9(4/x+(9+x)/y);
		
		//int i = 1;
		//int j = 1+ ++i;
		
		//System.out.println("i "+ i);
		//System.out.println("j "+ j);
		
		
		
		
		
		
		//Sep. 12th, 2017
		//byte n = 127; 
		//System.out.println("Before " + n);
		//n++;
		//System.out.println("After " + n);
		
		/*double a = 1.99999999999999999999; 
		System.out.println(a);
		
		char x = (char) 98;//ASCII Number
		System.out.println(x);
		
		boolean lightsOn = (2 > 3 || 3 < 5); 
		if (lightsOn) {
			System.out.println("I can see.");
		}
		else if (1 > 5){
			System.out.println("I can't see.");
		}
		else {
			System.out.println("What the fuck?");
		}*/
		
		
		/*Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		final double pi = 3.1415926535798;
		double area = radius * radius * pi;
		System.out.println("The area is ");
		System.out.print(area);*/
		
		//int i = 1;
		//int a = ++i + i;
		//System.out.println(a);
		
		
		
		
		
		//Sep 14th, 2017
		
		//Math.pow(a, b);
		//Math.PI;
		//Math.abs(a);
		//System.out.println(Math.E);
		
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter monthly interest rate: ");
		double monthIntRate = input.nextDouble();
		
		System.out.print("Enter numbers of years: ");
		int numYears = input.nextInt();
		
		System.out.print("Enter loan amount: ");
		double numLoan = input.nextDouble();
		
		double monthlyPayment = numLoan * monthIntRate /(1 - (1/Math.pow(1 + monthIntRate, numYears * 12)));
		
		System.out.println("The monthly payment is: " + monthlyPayment);
		System.out.println("The total payment is: " +monthlyPayment * numYears);
		*/
		
		
		
		
		//Sep. 19th, 2017
		
		/*int a = 7;
		int b = 100;
		
		int temp = b;
		b = a;
		a = temp;
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);//Swap Value
	
		int x = 1;
		x = 5 + 3*(x++);
		System.out.println(x);//operator order
		
	
		x = 5 + 3*(++x);
		System.out.println(x);//operator order
		
		*/
		
		
		
		//Sep. 20th, 2017
		
		
		//System.out.println(Math.random());
		//System.out.println((int)(2 * Math.random()));
		
		
		
		
		
		
		//Sep. 21th, 2017
		
		
		/*Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		
		if(name.compareTo("Daniel") == 0) {
			
		}
		else {
			
			nested if.
			indentation
			else is paired with innermost if
			
		}*/
		
		//Sep. 26th, 2017
	/*	int a = 5;
		switch (a) {
		case 1: 
			System.out.print("One");
			break;
		case 5: 
			System.out.print("def");
			break; // get you out of the loop
		
		}
		while (true) {  //pre condition loop
			
			continue;//start at 174
			//skip the code here and start the code again.
		}
		
		//Sep. 27th, 2017
		
		int g =1;
		do {
			
		} while(g == 4);//post condition loop
		//for loop
		for (int a = 0; a < 10; a++) {
			
		}
		
		
		int a[] = new int[3];
		a[0] =1;
		a[1] = 5;
		a[2] = 6;
		*/
		
		//Oct 12, 2017
		
		
	}
	
	/*Oct 12, 2017
	
	public static double cost (double price, double discount) {
		
		double money;
		
		money = price*(1-discount);
		
		return money;
	}
	
	public static double cost(double price, int discount) {
		
		double money;
		
		money = price*(1-(discount/100));
		
		return money;
		}
		*/
	
	//	public static void oct18() {
		
		//An array is a named sequence of contiguous memory locations capable of holding a collection of data of the same type. 
		
			//A primitive variable stores 
			//A reference variable holds a memory address of reference.
			
			//Array declaration
			//type []name;
			//initialization
			//name = new type(size);
			//both
		//	int a[] = new int[3];
			
	//		System.out.println(a.length);
			
			
			//name.length()
			
		}
		
		//oct.19
		
	//recursion: is a method where the solution to a problem depends on solution to smaller instance of the same problem 
		//breaking the big problem into lots of  
	/*characteristic: 1. A simple base case which we have a solution for and a return value. the case where we stop looping. 
					2. A way of getting our problem closer to the base case. 
					3. recursive call
		*/

