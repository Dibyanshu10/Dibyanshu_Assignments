package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops24 
 {
	public static void main(String[] args)
	 {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter as number");
			 int n = sc.nextInt();
			 System.out.println("Factorial of number is :: ");
			 int factorial =1;
			 for(int i=1; i<=n; i++)
			 {
				 factorial = factorial*i;
				 
			 }
			 System.out.println(factorial);
		}
	 }
}
