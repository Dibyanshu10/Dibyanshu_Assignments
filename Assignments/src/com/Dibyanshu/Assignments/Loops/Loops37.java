package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops37 
{
	public static void main(String[] args) 
	{

	 try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the number :: ");
		 int  n = sc.nextInt();
		 int a =0;
		 int b =1;
		 for (int i = 1; i <= n; ++i) 
		 {
			 System.out.println(a+" ");
			 int next = a+b;
			 a=b;
			 b=next;
		 }
	   }
    }
}
