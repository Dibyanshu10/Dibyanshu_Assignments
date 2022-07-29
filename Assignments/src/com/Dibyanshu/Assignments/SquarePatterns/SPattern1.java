package com.Dibyanshu.Assignments.SquarePatterns;

import java.util.Scanner;

public class SPattern1 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of rows you want");
			int r = sc.nextInt();
			for(int i = 0; i<r; i++)
			{
				for(int j =0; j<r; j++)
				{
					System.out.print("1 ");
				}
				System.out.println( );
			}
	    }
	 }
 }


