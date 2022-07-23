package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse19 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Marks in Physics");
			int phy= sc.nextInt();
			System.out.println("Enter Marks in Chemistry");
			int chem= sc.nextInt();
			System.out.println("Enter Marks in Biology");
			int bio= sc.nextInt();
			System.out.println("Enter Marks in Mathematics");
			int math= sc.nextInt();
			System.out.println("Enter Marks in Computer");
			int comp= sc.nextInt();
			double percent =(phy+chem+bio+math+comp)/5;
			System.out.println("Percent is::"+percent+"%");
			if(percent>=90)
			{
				System.out.println("Grade A");
			}
			else if(percent>=80 && percent<90)
			{
				System.out.println("Grade B");
			}
			else if(percent>=70 && percent<80)
			{
				System.out.println("Grade C");
			}
			else if(percent>=60 && percent <70)
			{
				System.out.println("Grade D");
			}
			else if(percent>=40 && percent<60)
			{
				System.out.println("Grade E");
			}
			else if(percent<=40)
			{
				System.out.println("Grade F");
			}
		}
	}
 }


