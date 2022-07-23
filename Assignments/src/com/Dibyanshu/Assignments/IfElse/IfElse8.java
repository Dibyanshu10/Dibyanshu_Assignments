package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse8 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the alphabet you want to check");
			char ch = sc.next().charAt(0);  
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||
					ch=='O'||ch=='u'||ch=='U')
			{
				System.out.println("Entered alphabet is a vowel");
			}
			else if(ch>='a' && ch<='z' || ch>='A'&& ch<='Z')
			{
				System.out.println("Entered alphabet is a consonant");
			}
			else 
				{
					System.out.println("Special Character. Please Eenter Alphabet");
				}
			}
		}
	}
			
 
