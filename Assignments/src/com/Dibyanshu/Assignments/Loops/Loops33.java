package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops33 
{

	public static void main(String[] args) 
	{
		
	
	 try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the number :: ");
		 int  n = sc.nextInt();
		 
		 
				int count=0;
				
			
			for(int i =1; i<=n/2; i++)
			{
					
			if(n%i==0 )
			{
				count= count + i;
			}
		 }
			if (count == n)
			{
				System.out.println("Number is a perfect number");
			}
			else
				{
					System.out.println("Number is a not perfect");	
			}
	  }
	}
	
	
	
	
	
	
	
	
	
	
	



}
