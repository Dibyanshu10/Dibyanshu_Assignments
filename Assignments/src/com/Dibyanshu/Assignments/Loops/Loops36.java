package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops36
{
	public static void main(String[] args) 
	{
		
	
	 try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the number :: ");
		 int  n = sc.nextInt();
		 while(n!=0)
		 {
			 
		 
			int a=n;
			int c=0,d=1,sum=0;
			while(a>0)
			{
			c=a%10; 
			for(int i = 1;i<=c;i++) 
			{
			d = d * i;
			}
			sum = sum + d;
			a=a/10;
			c=0;d=1;
			}
			if(sum==n)
			{
			System.out.println(n);
			}
			
			n--;
			 }
		}
	}

}

