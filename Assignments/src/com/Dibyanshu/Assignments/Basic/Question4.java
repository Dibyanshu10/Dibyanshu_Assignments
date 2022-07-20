package com.Dibyanshu.Assignments.Basic;
import java.util.Scanner;
public class Question4 
{
	 public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter Length of Rectangle");
				int Length = sc.nextInt();
				System.out.println("Enter Breadth of Rectangle");
				int Breadth = sc.nextInt();
				int area = Length * Breadth;
				System.out.println("Area of Rectangle is " + area);
			}
	    }

}
