package com.Dibyanshu.Assignments.TraianglePattern;

import java.util.Scanner;

public class TPattern1 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of rows you want");
			int r = sc.nextInt();
			for(int i = 1; i<=r; i=i+2)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
	}
}
