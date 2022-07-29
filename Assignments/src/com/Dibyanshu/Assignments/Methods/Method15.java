package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method15 
{
	public static void main(String args[] )
	{

	    try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number ");
			int n = sc.nextInt();
			Method15 method = new Method15();
			Method15.reverse(n);
			 
	    }
	}
	      public static void reverse(int n)
	      {
	    	  if(n<10)
	    	  {
	    		  System.out.println(n);
	    	  }
	    	  else 
	    		  {
//	    		  System.out.print("Reverse of the given number is: "); 
	    		  System.out.print(n % 10);  
	    		  reverse(n/10);   
	    		  }
			}
	      }
			
		
		