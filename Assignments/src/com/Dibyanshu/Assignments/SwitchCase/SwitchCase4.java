package com.Dibyanshu.Assignments.SwitchCase;

import java.util.Scanner;

public class SwitchCase4 
 {
	public static void main(String[] args) 
	 {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first number");
			int n1 = sc.nextInt();
			System.out.println("Enter second number");
			int n2 = sc.nextInt();
			int c;
			if(n1>n2)
			{
				c = 0;
			}
			else if (n2>n1)
			{
				c = 1;
			}
			else {
				{
					c=2;
				}
			}
		    
			
			switch (c) 
			 {
			   case 0:
			   {
				System.out.println("First number is greater");
				break;
			    }

			   case 1:
			   {
				System.out.println("Second number is greater");
				break;
			   }
			   case 2 :
			   {
				   System.out.println("Both numbers are equal");
				   break;
			   }
				   
			   
			   
			default:{
				System.out.println("Enter correct parameters");
			 }
		 }
	 
	   }
	}
}
