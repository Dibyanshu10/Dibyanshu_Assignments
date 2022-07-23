package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse18 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the cost price of the comodity");
			int cp= sc.nextInt();
			
			System.out.println("Enter the Selling price of the comodity");
			int sp= sc.nextInt();
			if(cp<sp)
			{
			  double profit = sp-cp;
			  System.out.println("Profit is ::"+profit);
			}
			else if(cp>sp)
				{
					double loss = cp-sp;
					System.out.println("Loss is ::"+loss);
					
				}
			else 
				{
				System.out.println("No Profit No Loss");
				}
			}
	 }

}
