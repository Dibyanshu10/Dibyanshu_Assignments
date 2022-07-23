package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse9 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the alphabet you want to check");
			char ch = sc.next().charAt(0);  
			
			 if(ch>='a' && ch<='z' || ch>='A'&& ch<='Z')
			{
				System.out.println("Entered character is a alphabet");
			}
			 else if(ch>='0' && ch<='9')
				{
					System.out.println("Entered Character is digit");
				}
			 else 
			 {
				 System.out.println("Entered Character is special Character");
				
			   }
			}
		}
  }
