package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops1
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int n = sc.nextInt();
			System.out.println("All natural numbers till the number "+ n + " is :");
			for (int i = 1; i <= n; i++) {
			    System.out.println(i);
			}
		}
    }
}




