package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse13 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the amount");
			int amount = sc.nextInt();
			int a =0;
			int b=0;
			int c =0;
			int d= 0;
			int e =0;
			int f =0;
			int g =0;
			if(amount>=2000)
			{
				a = amount/2000;
				amount = amount % 2000;
				System.out.println("Number of Two Thousand Notes::"+a);
			}
			 if(amount>=500)
			{
				b= amount/500;
				amount = amount % 500;
				System.out.println("Number of 500 Notes::"+b);
			}
			 if(amount%200==0)
			{
				c = amount/200;
				amount = amount % 200;
				System.out.println("Number of Two  Hundred notes::"+c);
			}
			 if(amount>=100)
			{
				d = amount / 100;
				amount = amount % 100;
				System.out.println("Number of Hundred::"+d);
			}
			 if(amount>=50)
			{
				e = amount /50;
				amount = amount % 50;
				System.out.println("Number of 50 Notes::"+e);
			}
			 if(amount>=20)
			{
				f = amount /20;
				amount = amount % 20;
				System.out.println("Number of 20 Notes::"+f);
			}
			 if(amount>=10)
			{
				g = amount /10;
				amount = amount % 10;
				System.out.println("Number of 10 notes::"+g);
			}
			else 
			{
				System.out.println("Enter Correct VAlue");
			}
		}
	}
 }
			
			
			
			


