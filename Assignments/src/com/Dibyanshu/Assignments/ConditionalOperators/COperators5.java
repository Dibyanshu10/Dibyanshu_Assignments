package com.Dibyanshu.Assignments.ConditionalOperators;

import java.util.Scanner;

public class COperators5 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the  Character you want to check ");
			char ch = sc.next().charAt(0);
			char ch1 = Character.toUpperCase(ch);
			 
			String res = ch1>='A' && ch1<='Z' ? "Alphabet" : "Some other Character";
			System.out.println(" Character is ::"+ res);
		}
	}
 }
