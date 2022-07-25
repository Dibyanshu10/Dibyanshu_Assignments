package com.Dibyanshu.Assignments.Strings;

import java.util.Scanner;

public class String2 
 {
	public static void main(String[] args) 
	{
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first  String ");
			 String s = sc.nextLine();
			 String s1 =s;
			 System.out.println("Your copied String is :: " +s);
		 }
	}

}
