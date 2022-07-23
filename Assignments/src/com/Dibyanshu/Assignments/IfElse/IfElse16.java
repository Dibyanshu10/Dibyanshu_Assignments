package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse16 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first angle of triangle");
			int angle1= sc.nextInt();
			
			System.out.println("Enter second angle of triangle");
			int angle2= sc.nextInt();
			
			System.out.println("Enter third angle of triangle");
			int angle3= sc.nextInt();
			
			if((angle1==angle2 )&& (angle1==angle3))
			{
				System.out.println("Triangle is an Equilateral triangle");
			}
			else if((angle1==angle2 )&& (angle1!=angle3) || (angle2==angle3 )&& (angle2!=angle1)||(angle3==angle1)&& (angle3!=angle1))
			{
				System.out.println("Triangle is an Issosceles triangle");
			}
			else 
			{
				System.out.println("Triangle is a Scalene tiangle");
			}
		}
	}
 }


