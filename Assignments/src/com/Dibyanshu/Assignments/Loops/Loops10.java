package com.Dibyanshu.Assignments.Loops;
import java.util.Scanner;
public class Loops10 
 {
	 public static void main(String[] args) 
     {
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			 int n = sc.nextInt();
			 int a = 0;
			while(n!=0)
			{
			    n = n/10;
			    ++a;
			}
			 System.out.println(a);
		}
    }
}
