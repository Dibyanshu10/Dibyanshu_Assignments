package com.Dibyanshu.Assignments.Basic;
import java.util.Scanner;
public class Question5 
 {
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Radius of Circle");
			int radius = sc.nextInt();
			double circumference = 2 * 3.14 * radius;
			double area = 3.14 * radius * radius;
			int diameter = 2 * radius;
			System.out.println("Circumference of Circle is " + circumference);
			System.out.println("Area of Circle is " + area);
			System.out.println("Diameter of Circle is " + diameter);
		}
    }
}
