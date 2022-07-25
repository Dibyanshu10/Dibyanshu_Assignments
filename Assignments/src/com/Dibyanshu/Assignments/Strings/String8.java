package com.Dibyanshu.Assignments.Strings;

import java.util.Scanner;

public class String8 
 {
	public static void main(String[] args) 
	{
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the  String ");
			 String s = sc.nextLine();
			 int a = 0;
			 int b = 0;
			 int c =0;
		
			 for(int i =0; i<s.length(); i++)
			 {
				 char ch = s.charAt(i);
				 if(ch>='a'&&ch<='z')
				 {
					 a++;
					 
				 }
				 else if (ch>='A'&&ch<='Z')
				 {
					 a++;
				 }
				 else if(ch>='0' && ch<='9')
				 {
					 b++;
				 }
				 else 
				 {
					c++;
				 }
			 }
			 System.out.println("Number of alphabet is ::"+a);
			 System.out.println("Number of digits is ::"+b);
			 System.out.println("Number of special is ::"+c);
		 }
	}
 }

				 
				 
				 
			 


