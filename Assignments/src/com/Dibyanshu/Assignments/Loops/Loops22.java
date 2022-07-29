package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops22 
{

	public static void main(String[] args)
	 {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter as number");
			 int n = sc.nextInt();
			 System.out.println("Factors of number are ");
			 for(int i=1; i<=n; i++)
			 {
				 if(n%i==0)
				 {
					 System.out.println(i);
				 }
				
			 }
		}
	}
}
