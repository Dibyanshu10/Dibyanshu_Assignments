package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse2 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First number");
			 int n1 = sc.nextInt(); 
			 System.out.println("Enter Second  number");
			 int n2 = sc.nextInt(); 
			 System.out.println("Enter Third  number");
			 int n3 = sc.nextInt(); 
			 if(n1>n2 && n1>n3)
			 {
				 System.out.println("First number is greatest of three ");
			 }
			 else if(n2>n1 && n2>n3)
			   {
			      System.out.println("Second  number is greater");
			  }
			 else {
				 {
					 System.out.println("Third number is greatest");
			}
			}
		}
	}


}
