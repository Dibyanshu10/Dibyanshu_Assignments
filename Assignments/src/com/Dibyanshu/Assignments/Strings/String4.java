package com.Dibyanshu.Assignments.Strings;

import java.util.Scanner;

public class String4 
 {
	public static void main(String[] args) 
	{
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first  String ");
			 String s = sc.nextLine();
			 System.out.println("Enter Second String ");
			 String s1 = sc.nextLine();
			 if(s1.equalsIgnoreCase(s))
			 {
				 System.out.println("Both Strings are same");
			 }
			 else 
				 {
				 System.out.println("Both Strings are Different");
				 }
			}
	}
}
