package com.Dibyanshu.Assignments.SwitchCase;

import java.util.Scanner;

public class SwitchCase3 
 {
	public static void main(String[] args) 
	 {
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the alphabet you want to check");
			char ch = sc.next().charAt(0);  
			char c = Character.toUpperCase(ch);
			switch (c)
			{
			 case 'A': 
			 {
				System.out.println("It's a vowel");
				break;
			 }
			 case 'E': 
			 {
				System.out.println("It's a vowel");
				break;
			 }
			 case 'I': 
			 {
				System.out.println("It's a vowel");
				break;
			 }
			 case 'O': 
			 {
				System.out.println("It's a vowel");
				break;
			 }
			 case 'U': 
			 {
				System.out.println("It's a vowel");
				break;
			 }
				
			default:
				System.out.println("Entered character is a consonant");	
			}
		 }
	 }
 }
