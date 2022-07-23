package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse20 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Basic salary of employee");
			double salary= sc.nextDouble();
			if(salary<=10000)
			{
				double grossSalary1 = salary + (salary*0.2)+(salary*0.8);
				System.out.println("Gross Salary of employee is::"+grossSalary1);
			}
			if(salary<=20000)
			{
				double grossSalary2 = salary + (salary*0.25)+(salary*0.9);
				System.out.println("Gross Salary of employee is::"+grossSalary2);
			}
			if(salary>20000)
			{
				double grossSalary3 = salary + (salary*0.3)+(salary*0.95);
				System.out.println("Gross Salary of employee is::"+grossSalary3);
			}
		}
	}
	
}
