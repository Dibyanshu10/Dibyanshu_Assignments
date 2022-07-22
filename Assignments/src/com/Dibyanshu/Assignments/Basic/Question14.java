package com.Dibyanshu.Assignments.Basic;

import java.util.Scanner;

public class Question14 
 {
public static void main(String[] args) 
{
	
	try (Scanner sc = new Scanner(System.in)){
	System.out.println("Enter the side of equilateral traingle");
	double side = sc.nextDouble();
	double area = (Math.sqrt(3))/4 * side * side;
	System.out.println("Area of equilateral Triangle is::"+ area);
	}
   }
  }
 
