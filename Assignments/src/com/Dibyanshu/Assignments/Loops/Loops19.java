package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops19 
{
	public static void main(String[] args)
	 {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter as number");
			 int n = sc.nextInt(); 
			 int a;
			 while(n>0)
			 {
				 a = n%10;
				 switch(a)
				 {
				 case 0:
						System.out.print("zero ");
						break;
					case 1:
						System.out.print("one ");
						break;
					case 2:
						System.out.print("two ");
						break;
					case 3:
						System.out.print("three ");
						break;
					case 4:
						System.out.print("four ");
						break;
					case 5:
						System.out.print("five ");
						break;
					case 6:
						System.out.print("six ");
						break;
					case 7:
						System.out.print("seven ");
						break;
					case 8:
						System.out.print("eight ");
						break;
					case 9:
						System.out.print("nine ");
						break;
					default:
						System.out.println("zero ");
						break;
					}
				    n/=10;
				}
			}
		}
				 
}
			  