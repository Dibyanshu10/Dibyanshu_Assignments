package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops34 
{
	public static void main(String[] args) 
	{
	 try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the number :: ");
		 int  n = sc.nextInt();
		 System.out.println("Perfect number between 1- n are::");
		 int count=0;
		 int i;int j;
		 while(n!=0)
		 {
			 
			 for( j = 1; j<=n; j++)
			 {
			 
			if(n%j==0 )
			{
				count= count + j;
			}
		 }
			if (count == n)
			{
				System.out.println(n);
			}
			n--;
		}
	  }
  }
}

