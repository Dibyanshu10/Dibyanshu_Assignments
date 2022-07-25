package com.Dibyanshu.Assignments.Strings;

import java.util.Scanner;

public class String3 
 {
		public static void main(String[] args) 
		{
			 try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter first  String ");
				 String s = sc.nextLine();
				 System.out.println("Enter Second String ");
				 String s1 = sc.nextLine();
				 System.out.println("Your copied String is :: " +s.concat(s1));
			 }
		}

	}

