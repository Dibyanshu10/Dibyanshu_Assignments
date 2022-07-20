package com.Dibyanshu.Assignments.Loops;
import java.util.Scanner;
public class Loops6 
{
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int n = sc.nextInt();
			int a = 0;
			for (int i = 1; i <= n; i++)
			{
			     a = a + i;
			}
			System.out.println(" Sum of all number is :" + a);
		}
    }
}
