package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse10 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the alphabet you want to check");
			char ch = sc.next().charAt(0);  
			if(ch>='A' && ch<='Z')
			{
				System.out.println("Character is in Uppercase");
			}
			else if(ch>='a'&&ch<='z')
			{
				System.out.println("Character is in Lowercase");
			}
			else 
			{
				System.out.println("Invalid Input. Please enter Alphabet");
			}
		}
	}

}
