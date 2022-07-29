package com.Dibyanshu.Assignments.SquarePatterns;

import java.util.Scanner;

public class SPattern3 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of rows you want");
			int r = sc.nextInt();
			for(int i = 1; i<=r; i++)
			{
				for(int j =1; j<=5; j++)
				{
					System.out.print(j);
				}
				System.out.println( );
			}
	    }
	 }

}
