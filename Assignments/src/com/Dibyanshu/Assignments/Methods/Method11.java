package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method11 
{
	public static void main(String args[] )
	{

	    try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number ");
			int n = sc.nextInt();
	
			System.out.println("Natural number till the entered value is::");
			find(n,1);
	    }
	}
	       public static int find(int n, int i) 
	       {
	    	 
			if(i<=n) 
	    	   {
	    		System.out.println(i);
	    		 return find(n, ++i);
	    	   }
	    	   else 
	    	   {
	    		   return n;
	    	   }
			
		}
	}
