package com.Dibyanshu.Assignments.Loops;
import java.util.Scanner;
public class Loops9 
 {
	public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int a = 0;
        System.out.println("Table of number is :");
        for(int i=1; i<=10; i++)
        {
            a = n*i;
            System.out.println(a);

        }

    }
}
