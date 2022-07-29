package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method20 
{
	public static void main(String args[] )
	{

	    try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the first number ");
			int n1 = sc.nextInt();
			System.out.println("Enter the second number ");
			int n2 = sc.nextInt();
			Method20 m = new Method20();
			int result = m.HCF(n1, n2);
			System.out.println("HCF of two numbers::"+result);
	    }
	}
	       public int HCF(int n1, int n2)
	       {
	    	   if(n2!=0)
	    	   {
	    		   return HCF(n2, n1%n2);
	    	   }
	    	   else 
	    	   {
	    		   return n1;
			}
			
	       }
}


