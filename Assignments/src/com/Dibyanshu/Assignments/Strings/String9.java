package com.Dibyanshu.Assignments.Strings;

import java.util.Scanner;

public class String9
 {
	public static void main(String[] args) 
	{
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the  String ");
			 String s = sc.nextLine();
			 int a = 0;
			 int b = 0;
			
		
			 for(int i =0; i<s.length(); i++)
			 {
				 char ch = s.charAt(i);
				 char ch1 = Character.toUpperCase(ch);
				 if(ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' ||ch1=='U')
				 {
					 a++;
					 
				 }
				 else 
				 {
					 b++;
				 }
			 }
			 System.out.println("Number of vowels in the String are::"+a);
			 System.out.println("Number of consonants  in the String are::"+b);
         }
	}
 }
			 