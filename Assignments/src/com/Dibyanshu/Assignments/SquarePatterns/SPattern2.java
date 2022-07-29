package com.Dibyanshu.Assignments.SquarePatterns;

import java.util.Scanner;

public class SPattern2 
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
					if(i%2!=0)
					{
						if(j%2!=0)
						{
							System.out.print("1");
						}
						else 
						{
							System.out.print("0");
						}
					}
					else 
					{
						if(j%2!=0)
						{
							System.out.print("0");
						}
						else 
						{
							System.out.print("1");
						}
						
						
					}
				}
				System.out.println( );
			}
	    }
	 }

}
