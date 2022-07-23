package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse15 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first side of triangle");
			int side1= sc.nextInt();
			
			System.out.println("Enter second side of triangle");
			int side2= sc.nextInt();
			
			System.out.println("Enter third side of triangle");
			int side3= sc.nextInt();
			
			if((side1+side2)>side3 ||(side2+side3)>side1||(side1+side3)>side2) 
			{
				System.out.println("Traiangle is a valid triangle");
			}
			
			else 
				{
					System.out.println("Traiangle is not a valid triangle");
				}
			}
				
		}
	}
 


