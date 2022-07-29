package com.Dibyanshu.Assignments.SquarePatterns;

import java.util.Scanner;

public class SPattern5 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of rows you want");
			int r = sc.nextInt();
			for(int i = 1; i<=r; i++)
			{
				int n =i;
				for(int j =1; j<=r; j++)
				{
					System.out.print(n++);
				}
				System.out.println( );
			}
	    }
	 }

}
