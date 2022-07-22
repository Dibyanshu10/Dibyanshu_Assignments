package com.Dibyanshu.Assignments.Basic;

import java.util.Scanner;

public class Question13 
 {
	public static void main(String[] args) 
	  {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the base of triangle");
			int base = sc.nextInt();
			System.out.println("Enter the height of triangle");
			int height = sc.nextInt();
			double area = 0.5 * base * height;
			System.out.println("Area of triangle is ::" + area);
		}
	}
}
