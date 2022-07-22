package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops12 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			 int n = sc.nextInt();
			 int firstDigit=0;
			 int lastDigit=0;
			 int a = 0;
			 lastDigit = n % 10;
			 while(n!=0)
			 {
				 firstDigit = n%10;
				 n =n/10;
			}
			 System.out.println("Sum of First and last digit is ::"+ (firstDigit + lastDigit));
		} 
	}

}
