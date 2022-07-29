package com.Dibyanshu.Assignments.Strings;

import java.util.Scanner;

public class String38 
{
	public static void main(String[] args) 
	{
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the  String ");
			 String s = sc.nextLine();
			 System.out.println(s.replaceAll("\\s", ""));
         }
	}
	

}
