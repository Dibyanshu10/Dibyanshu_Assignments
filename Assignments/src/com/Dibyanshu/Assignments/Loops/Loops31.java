package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops31 
{

	public static void main(String[] args) 
	{
		
	
	 try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the number :: ");
		 int  n = sc.nextInt();
		 int a =0;
		 int sum =0;
		int n1;	
			n1 =n;
			 while(n1!=0)
	            {
	                a = n1 % 10;
	                sum = sum + (a * a * a);
	                n1 = n1 / 10;
	            }
	            if(sum == n)
	            {
	                System.out.print("Number is an armstrong number");
	            }
	            else 
	            {
	            	System.out.print("Number is not an armstrong number");
				}
	            
	        }
	 }
  }	 
	
		 

	
	

