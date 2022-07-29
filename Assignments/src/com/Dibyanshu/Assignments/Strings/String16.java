package com.Dibyanshu.Assignments.Strings;

import java.util.Scanner;

public class String16 
{
	public static void main(String[] args) 
	{
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the  String ");
			 String s = sc.nextLine();
				System.out.println("Enter the character to be found");
				 char ch = sc.next().charAt(0);
			 String str = "";
			
			int i =0;
			 for( i =0; i<s.length(); i++)
			 {
				 char ch1 = s.charAt(i);
			 
			    if(ch1==ch)
			    {
			    	System.out.println("Occurence of character "+ch+"found at "+i );
			    }
			 }
         }
	}

}
