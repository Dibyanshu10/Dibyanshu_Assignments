package com.Dibyanshu.Assignments.Basic;
import java.util.Scanner;
public class Question6 
{
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Length in Centimeter");
			int cm = sc.nextInt();
			double meter = cm / 100;
			double km = cm / 100000;
			System.out.println("Value in meters is " + meter);
			System.out.println("Value in kilometers is " + km);
		}
    }
}
