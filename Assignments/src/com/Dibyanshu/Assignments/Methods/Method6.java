package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method6 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first  number");
			int n1 = sc.nextInt();
			System.out.println("Enter second  number");
			int n2 = sc.nextInt();
			System.out.println("Prime number between first and second number are::");
			for(int i = n1; i<=n2; i++)
			{
				
			if(isPrime(i) )
			{
				System.out.println(i);
				
			}
		}
	}
		
}
			public static boolean isPrime(int n)
			{
				
				boolean str=true;
			
			for(int i =2; i<=n/2; i++)
			{
				
			if(n>1 && n%1==0  && n%i!=0 )
			{
				
				str = true;
			}
			else
				{
					
					str = false;		
			}
		}
			return str;
    }
 }
