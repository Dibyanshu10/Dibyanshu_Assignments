package com.Dibyanshu.Assignments.Strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class String13 
 {
	public static void main(String[] args) 
	{
		 try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the  String ");
				 String s = sc.nextLine();
	            System.out.println(reverseWords(s));
		 }
}
	static String reverseWords(String str)
	{
		Pattern pattern=Pattern.compile("\\s");
		String[] p = pattern.split(str);
		String result = "";

		for (int i = 0; i < p.length; i++) {
			if (i == p.length - 1)
				result = p[i] + result;
			else
				result = " " + p[i] + result;
		}
		return result;
	}
}