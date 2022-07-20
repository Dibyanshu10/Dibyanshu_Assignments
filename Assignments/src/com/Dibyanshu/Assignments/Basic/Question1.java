package com.Dibyanshu.Assignments.Basic;
import java.util.Scanner;
public class Question1 
 {
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first number");
			int a = sc.nextInt();
			System.out.println("Enter Second number");
			int b = sc.nextInt();
			int c =a+b;
			System.out.println("Sum of the numbers " + c);
		}

    }
}
