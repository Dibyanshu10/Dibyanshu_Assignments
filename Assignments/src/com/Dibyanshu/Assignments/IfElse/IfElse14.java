package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse14 
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
			
			if((angle1+angle2+angle3)==180)
			{
				System.out.println("Triagle is a valid Triangle");
			}
			else if((angle1+angle2+angle3)<180)
			{
				System.out.println("It is  not a valid Triangle");
			}
			else 
			{
				System.out.println("It is  not a valid Triangle");
			}
		}
		
	}
}
