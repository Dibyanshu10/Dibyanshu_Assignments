package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method5 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int n = sc.nextInt();
			Method5 method = new Method5();
			String prime = method.isPrime(n);
			String perfect = method.isPerfect(n);
			System.out.println( prime);
			System.out.println(perfect);

		}
	}
			public String isPrime(int n)
			{
				
				String str="";
			
			for(int i =2; i<=n/2; i++)
			{
				
			if(n>1 && n%1==0  && n%i!=0 )
			{
				
				str = "Number is Prime";
			}
			else
				{
					
					str = "Number is not prime";		
			}
		}
			return str;
    }
			public String isPerfect(int n)
			{
				int count=0;
				String str = "";
			
			for(int i =1; i<=n/2; i++)
			{
					
			if(n%i==0 )
			{
				count= count + i;
			}
		 }
			if (count == n)
			{
				str = "Perfect Number";
			}
			else
				{
					str= "Number is not perfect";	
			}
			return str;
		}
	         
    }

			

			
			
			
			
	 
  

	
