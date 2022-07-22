package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops15 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			 int n = sc.nextInt();
			 int a =1; 
			 int b =0;
			 while(n!=0)
			 {
				 b = n%10;
				 a = a*b;
				 n = n/10;
			 }
			 System.out.println("Product of digits of number is "+ a);
		}
    }
}

 


