package com.Dibyanshu.Assignments.Basic;

import java.util.Scanner;

public class Question8 
{
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Temperature in degree Fahrenheit");
			double fah = sc.nextDouble();
			double cel = (fah-32) * 5/9;
		    System.out.println("The converted temperature in Celsius is ::"+cel);
	 }
   }
 }


