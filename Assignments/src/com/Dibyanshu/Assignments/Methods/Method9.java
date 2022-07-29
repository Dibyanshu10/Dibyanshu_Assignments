package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method9 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first  number");
			int n1 = sc.nextInt();
			System.out.println("Enter second  number");
			int n2 = sc.nextInt();
			System.out.println("Perfect number between first and second number are::");
			for(int i = n1; i<=n2; i++)
			{
				
			if(isPerfect(i) )
			{
				System.out.println(i);
				
			}
		}
	}
		
}
			public static boolean isPerfect(int n)
			{
				int count=0;
				boolean str=true;
			
				for(int i =1; i<=n/2; i++)
				{
						
				if(n%i==0 )
				{
					count= count + i;
				}
			 }
				if (count == n)
				{
					str = true;
				}
				else
					{
						str= false;	
				}
				return str;
			}
		         
	    }

				
