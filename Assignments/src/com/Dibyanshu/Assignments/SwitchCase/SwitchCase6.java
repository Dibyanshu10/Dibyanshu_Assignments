package com.Dibyanshu.Assignments.SwitchCase;

import java.util.Scanner;

public class SwitchCase6 
 {
	public static void main(String[] args) 
	 {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first number");
			int n1 = sc.nextInt();
			System.out.println("Enter Second number");
			int n2 = sc.nextInt();
			System.out.println("Enter the operation you want to do: '+' or '-' or '/' or '*'");
			char ch = sc.next().charAt(0);
			
			switch (ch) 
			{
			case '+': 
			{
		    	int result = n1+n2;
				System.out.println("Sum of numbers is "+ result);
				break;
			}
			case '-': 
			{
		    	int result = n1-n2;
				System.out.println("Difference of numbers is "+ result);
				break;
			}
			case '*': 
			{
		    	int result = n1*n2;
				System.out.println("Product of numbers is "+ result);
				break;
			}
			case '/': 
			{
		    	int result = n1/n2;
				System.out.println("Division of numbers is "+ result);
				break;
			}
			default:
				System.out.println("Enter correct argumwnt");
			}
		}
	 }
					}
