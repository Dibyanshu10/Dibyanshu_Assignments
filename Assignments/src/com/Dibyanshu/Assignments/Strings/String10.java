package com.Dibyanshu.Assignments.Strings;

import java.util.Scanner;

public class String10 
 {
	public static void main(String[] args) 
	{
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the  String ");
			 String s = sc.nextLine();
			 int a =1;
			
			 for(int i =0; i<s.length(); i++)
			 {
				if(s.charAt(i)==' ')
				{
					 a++;
			   	}
			 }
			  System.out.println(" Number of words in the String are::"+a);
         }
	}
 }