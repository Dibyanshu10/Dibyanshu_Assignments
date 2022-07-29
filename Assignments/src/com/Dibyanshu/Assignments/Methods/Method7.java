package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method7 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first  number");
			int n1 = sc.nextInt();
			System.out.println("Enter second  number");
			int n2 = sc.nextInt();
			System.out.println("Strong number between first and second number are::");
			for(int j = n1; j<=n2; j++)
			{
				
			if(isStrong(j) )
			{
				System.out.println("Strong numbers in the given range ::" +j);
			}
			
			
			
		}
	}
}
	        public static boolean isStrong(int n)
	        {
	        
	        	int f = 1;
	        	int s = 0;
	        	while(n!=0)
	        	{
	        		n = n%10;
	        		for(int i=1; i<=n; i++)
	        		{
	        		  f = f*i;
	        		  
		        		
	        		}
	        		s = s+f;
	        		n = n/10;
	        		
	        	 }
	        	
	        		if(s==n)
	        		{
	        			 return true;
	        		}
	        		else 
	        		{
	        			 return false;
	        		}
	        	 
	        	   
	        }
 }
	        	
	        	
	        
 
