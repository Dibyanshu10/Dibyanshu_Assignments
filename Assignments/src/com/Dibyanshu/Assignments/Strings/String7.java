package com.Dibyanshu.Assignments.Strings;

import java.util.Scanner;

public class String7 
 {
	public static void main(String[] args) 
	{
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the  String ");
			 String s = sc.nextLine();
			 String s1 ="";
			 for(int i =0; i<s.length(); i++)
			 {
				 if((Character.isUpperCase(s.charAt(i))))
				 {
				 
					 s1=s1+Character.toLowerCase(s.charAt(i));
			     }
				else 
				{
					 s1=s1+Character.toUpperCase(s.charAt(i));
				}
			 }
			 System.out.println("String in Toggle case is ::" + s1);
		 }
	}
 }

	

