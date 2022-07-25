package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method2 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the radius of circle");
			int r = sc.nextInt();
			Method2 method = new Method2();
			double d = method.Calculate1(r);
			double c = method.Calculate2(r);
			double a = method.Calculate3(r);

			System.out.println("Diameter Circle is ::"+d);
			System.out.println("Circumference Circle is ::"+c);
			System.out.println("Area Circle is ::"+a);
		}
	}
			
			
			public double Calculate1(int r)
			{
				int diameter = 2 * r;
				return diameter;
			}
			public double Calculate2(int r)
			{
				double circum = 2 * 3.14 * r;
				return circum;
			}
			public double Calculate3(int r)
			{
				double area = 3.14 * r * r;
				return area;
			}



}
