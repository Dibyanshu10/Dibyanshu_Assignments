package com.Dibyanshu.Assignments.Basic;
import java.util.Scanner;
public class Question3 
 {
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Length of Rectangle");
			int Length = sc.nextInt();
			System.out.println("Enter Breadth of Rectangle");
			int Breadth = sc.nextInt();
			int perimeter = 2 * (Length + Breadth);
			System.out.println("The Perimeter of Rectangle is " + perimeter);
		}
    }
}
