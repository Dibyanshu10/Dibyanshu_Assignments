package com.Dibyanshu.Assignments.Basic;

import java.util.Scanner;

public class Question17 
 {
	public static void main(String[] args) 
	 {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Priciple");
			double p = sc.nextInt();
			System.out.println("Enter rate of interest ");
			double r = sc.nextInt();
			System.out.println("Enter time in yearss ");
		    double t = sc.nextInt();
			double amount  = p * Math.pow(((100 + r)/100),t);
			double ci = amount - p;
			System.out.println("Compound Interest is ::"+ ci);
		}
	 }
}
