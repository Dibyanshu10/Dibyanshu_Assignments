package com.Dibyanshu.Assignments.Strings;

import java.util.Scanner;

public class String12 
 {

	public static void main(String[] args) 
	{
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the  String ");
			 String s = sc.nextLine();
			 String str = "";
			
			 for(int i =0; i<s.length(); i++)
			 {
			    char ch = s.charAt(i);
			    str = ch + str;
			 }
			 if(str.equalsIgnoreCase(s))
			 {
				 System.out.println("String is a Palindrome String");
			 }
			 else 
			 {
				 System.out.println("String is  not a Palindrome String");
			}
         }
	}
}
