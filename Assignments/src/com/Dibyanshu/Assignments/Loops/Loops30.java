package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops30 
{
	public static void main(String[] args) 
	{
		
	
	 try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the number :: ");
		 int  n = sc.nextInt();
		 
	      for(int i = 2; i< n; i++) 
	      {
	         while(n%i == 0) 
	         {
	            System.out.println(i+" ");
	            n = n/i;
	         }
	      }
	      if(n >2) 
	         System.out.println(n);
	      }
	   }

}
