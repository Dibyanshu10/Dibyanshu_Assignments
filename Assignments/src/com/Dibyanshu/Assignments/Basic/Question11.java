package com.Dibyanshu.Assignments.Basic;

import java.util.Scanner;

public class Question11 
 {
public static void main(String[] args) 
 {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter a number");
		int number = sc.nextInt();
		double sqrt = Math.sqrt(number);
		System.out.println("The square root of the number is ::"+sqrt);
	}

 }
}
