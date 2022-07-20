package com.Dibyanshu.Assignments.Basic;
import java.util.Scanner;
public class Question2 
 {
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first number");
			int a = sc.nextInt();
			System.out.println("Enter Second number");
			int b = sc.nextInt();
			int c = a + b;
			int d = a - b;
			int e = a * b;
			int f = a / b;
			System.out.println(" Sum of two numbers is " + c);
			System.out.println(" Difference of two numbers is " + d);
			System.out.println(" Multiplication  of two numbers is " + e);
			System.out.println(" Division of two numbers is " + f);
		}
    }
}
