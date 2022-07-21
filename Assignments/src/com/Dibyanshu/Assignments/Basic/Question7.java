package com.Dibyanshu.Assignments.Basic;
import java.util.Scanner;
public class Question7 
 {
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Temperature in degree Celsius");
			double cel = sc.nextDouble();
			double fah = (cel * 9/5) + 32;
		    System.out.println("The converted temperature in Fahrenheit is ::"+fah);
	 }
   }
 }
