package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops27 
 {
	public static void main(String[] args) 
	{
		
	
	 try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter first number :: ");
		 int  n = sc.nextInt();
		 int count = 0; 
		 for(int i =1; i<=n; i++)
		 {
			 if(n%i==0)
			 {
				 count++;
			 }
		 }
			 if(count==2)
			 {
				 System.out.println("Number is prime");
			 }
			 else 
			 {
				System.out.println("Number is not a prime number");
			}
		 }
	 }
  }
