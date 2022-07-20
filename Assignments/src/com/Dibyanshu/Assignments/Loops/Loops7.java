package com.Dibyanshu.Assignments.Loops;
import java.util.Scanner;
public class Loops7 
 {
	public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int n = sc.nextInt();
			int a = 0;
			for (int i = 1; i <= n; i++)
			{
			    if (i % 2 == 0) {
			        a = a + i;
			    }
			}
			System.out.println("Sum of even numbers :" + a);
		}
    }
}
