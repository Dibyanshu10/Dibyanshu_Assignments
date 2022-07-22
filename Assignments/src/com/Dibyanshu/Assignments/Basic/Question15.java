package com.Dibyanshu.Assignments.Basic;

import java.util.Scanner;

public class Question15 
 {
public static void main(String[] args) 
 {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter marks in Subject 1 ");
		int marks1 = sc.nextInt();
		System.out.println("Enter marks in Subject 2 ");
		int marks2 = sc.nextInt();
		System.out.println("Enter marks in Subject 3 ");
		int marks3 = sc.nextInt();
		System.out.println("Enter marks in Subject 4 ");
		int marks4 = sc.nextInt();
		System.out.println("Enter marks in Subject 5 ");
		int marks5 = sc.nextInt();
		int total = marks1 + marks2 + marks3 + marks4 + marks5;
		double average =( marks1 + marks2 + marks3 + marks4 + marks5)/5;
		double percent = (total /5);
		System.out.println("Total marks scored ::"+ total);
		System.out.println("Average marks scored ::"+ average);
		System.out.println("Percentage (%)::"+ percent);
	}
 }
}
