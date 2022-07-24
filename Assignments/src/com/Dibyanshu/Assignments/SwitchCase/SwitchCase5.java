package com.Dibyanshu.Assignments.SwitchCase;

import java.util.Scanner;

public class SwitchCase5 
 {
	public static void main(String[] args) 
	 {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first number");
			int n = sc.nextInt();
			switch (n%2) 
			 {
			  case 0: 
			  {
				
				System.out.println("Number is even");
				break;
	
			  }
			  case 1 :
			  {
				  System.out.println("Number is odd");
				  break;
			  }
			default:
				System.out.println("Invalid input. Enter a digit.");
			}
		}
	 }

}
