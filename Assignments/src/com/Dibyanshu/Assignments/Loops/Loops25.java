package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops25 
 {
	public static void main(String[] args) 
	{
		
	
	 try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter first number :: ");
		 int  a = sc.nextInt();
		 System.out.println("Enter second number :: ");
		 int b = sc.nextInt();
		 int hcf = 0;

		 for(int i = 1; i <= a || i <= b; i++) {
		    if( a%i == 0 && b%i == 0 )
		    hcf = i;
		 }
		 System.out.println("HCF of given two numbers is ::"+ hcf);
	}
  }

}
