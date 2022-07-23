package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse7 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the character you want to check");
			char ch = sc.next().charAt(0);  
			if(ch>='a' && ch<='z' || ch>='A'&& ch<='Z')
			{
				System.out.println("Input Character is alphabet");
			}
			else 
				{
					System.out.println("Input Character is special character");
				}
			}
			
		}
 }


