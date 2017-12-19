/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Danial
 
 Date: Sep 20th, 2017
  
  This program is aimed to calculate the shipping charge.
*/

package homework_Jeff;

import java.math.BigDecimal;
import java.util.Scanner;

public class Shipping_Charge_Jeff {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the weight of the package in kg: ");
		double weight = input.nextDouble();
		
		System.out.print("Please enter the shipping price per kg: ");
		double ppkg = input.nextDouble();
		
		double charge = weight * ppkg;
		
		int temp = Math.round((int)(charge * 100));
		double result =  temp/100.0;
		System.out.println("The shipping charge is: " + result);
		
		
		//Method 2
		
		/*BigDecimal result = new BigDecimal(charge);
		  double result2 = result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		  
		  System.out.println("The shipping charge is: " + result2);*/
		
		
		
		
	}

}
