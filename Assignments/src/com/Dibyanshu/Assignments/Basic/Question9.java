package com.Dibyanshu.Assignments.Basic;

import java.util.Scanner;

public class Question9 
 {
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the numbers of days");
			int days = sc.nextInt();
			double year = days/365;
			int weeks = days/7;
			int daysLeft = days%365;
			int daysLeft2 = days%7;
			System.out.println("Number of Years = "+ year);
			System.out.println("Number of days left after  "+year+" years = "+ daysLeft);
			System.out.println("Number of Weeks = "+ weeks);
			System.out.println("Number of days left after  "+ weeks +" weeks = "+ daysLeft2);
			
  }
 }
}
