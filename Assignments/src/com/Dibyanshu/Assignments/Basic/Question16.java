package com.Dibyanshu.Assignments.Basic;

import java.util.Scanner;

public class Question16 
 {
	public static void main(String[] args) 
	 {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Priciple");
			int p = sc.nextInt();
			System.out.println("Enter rate of interest ");
			int r = sc.nextInt();
			System.out.println("Enter time ");
			int t = sc.nextInt();
			double si = (p*r*t)/100;
			System.out.println("Simple Interest is ::"+ si);
		}
	 }
}
