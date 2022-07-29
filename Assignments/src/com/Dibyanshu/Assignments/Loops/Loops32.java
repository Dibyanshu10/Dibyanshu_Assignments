package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops32 
{
	public static void main(String[] args) 
	{
		
	
	 try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the number :: ");
		 int  n = sc.nextInt();
		 System.out.println("Armstrong numbers bertween 1 -N are");
		 int a =0; int  n1 = 0;
		 int sum = 0;
		 for(int i = 1; i <= n; i++)
	        {
	           n1 = i;
	            while(n1 > 0)
	            {
	                a = n1 % 10;
	                sum = sum + (a * a * a);
	                n1 = n1 / 10;
	            }
	            if(sum == i)
	            {
	                System.out.print(i+" ");
	            }
	            
	        }
	 }
   }
}
