package com.Dibyanshu.Assignments.Strings;

import java.util.Scanner;

public class String11 
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
			  System.out.println(" Reverse of  the String is::"+str);
         }
	}
 }


