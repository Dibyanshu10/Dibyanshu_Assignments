package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse17 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the value of a");
			int a= sc.nextInt();
			
			System.out.println("Enter the value of b");
			int b= sc.nextInt();
			
			System.out.println("Enter the value of c");
			int c= sc.nextInt();
			
			double discrimnant = (b*b) - 4*a*c;
			if(discrimnant==0)
			{
				double root1 = -b/(2*a);
				System.out.println("Roots are ::"+ root1);
			}
			else if(discrimnant>0)
			{
				double root2 = (-b + Math.sqrt(discrimnant))/2*a;
				double root3 = (-b - Math.sqrt(discrimnant))/2*a;
				System.out.println("Roots are ::"+ root2);
				System.out.println("Roots are ::"+ root3);
			}
			else 
			{
				System.out.println("Roots are not real");
			}
		}
	}
	
			
	

}
