package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method8 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first  number");
			int n1 = sc.nextInt();
			System.out.println("Enter second  number");
			int n2 = sc.nextInt();
			System.out.println("Armstrong number between first and second number are::");
			for(int i = n1; i<=n2; i++)
			{
				
			if(isArmstrong(i) )
			{
				System.out.println(i);
			}
		}
	}
}
	        public static boolean isArmstrong(int n)
	        {
	        	boolean b = true;
	        
	            int l;
	        	int s = 0;
	        	while(n>0)
	        	{
	        		l = n%10;
	        		s = s + (l*l*l);
	        		n = n/10;
	        		
	        	 }
	        	
	        		if(s==n)
	        		{
	        			 b = true;
	        		}
	        		else 
	        		{
	        			 b = false;
	        		}
	        	 return b;
	        	   
	        }

}
