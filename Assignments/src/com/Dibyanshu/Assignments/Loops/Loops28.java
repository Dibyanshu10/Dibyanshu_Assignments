package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops28 
{
	public static void main(String[] args) 
	{
		
	
	 try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the number :: ");
		 int  n = sc.nextInt();
	     int i;
	     System.out.println("Prime numbers between 1 - N are::");
		 for (int a =2; a<=n; a++)
		 {
			 int count = 0; 
		 
		 for( i =1; i<=a; i++)
		 {
			 if(a%i==0)
			 {
				 count++;
			 }
		 }
			 if(count==2)
			 {
				 System.out.println(a);
			 }
			
			
		 }
	 }
   }
}