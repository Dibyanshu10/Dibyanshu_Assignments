package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method16 
{

	public static void main(String args[] )
	{

	    try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number ");
			int n = sc.nextInt();
			Method15 method = new Method15();
			
			if(reverse(n))
			{
				System.out.println("Number is palindrome");
			}
			else 
			{
				System.out.println("Number is not a palindrome number");
			}
			 
	    }
	}
	      public static boolean reverse(int n)
	      {
	    	  if(n<10)
	    	  {
	    		  System.out.println(n);
	    	  }
	    	  else 
	    		  {
	    		   
	    		  System.out.print(n % 10);  
	    		  reverse(n/10);   
	    		  }
			}

}
