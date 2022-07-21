package com.Dibyanshu.Assignments.Basic;

import java.util.Scanner;

public class Question10 
 {
	public static void main(String[] args) 
	{
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter base of Number");
			int base = sc.nextInt();
			System.out.println("Enter exponent of Number");
			int expo  = sc.nextInt();
			double power = Math.pow(base, expo);
			System.out.println("POWER of number is =" + power);
       }
	}
 }
