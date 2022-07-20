package com.Dibyanshu.Assignments.Loops;
import java.util.Scanner;
public class Loops11 
 {
	 public static void main(String[] args)
     {
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			 int n = sc.nextInt();
			 int firstdigit=0;
			 int lastdigit=0;
			 int a =0;
			 lastdigit = n%10;
			 System.out.println("Last Digit is ::" + lastdigit);
			 while (n!=0)
			 {
			     firstdigit = n % 10;
			     n /= 10;
			 }
			 System.out.println("First Digit is ::" + firstdigit);
		}
     }
}
