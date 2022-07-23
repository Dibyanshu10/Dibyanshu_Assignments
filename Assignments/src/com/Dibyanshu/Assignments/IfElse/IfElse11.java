package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse11 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number to find days of week");
			int n = sc.nextInt();
			if(n==1) 
			 {
			   System.out.println("It's Sunday");
       		}
			else if(n==2) 
			 {
			   System.out.println("It's Monday");
      		}
			else if(n==3) 
			 {
			   System.out.println("It's Tuesday");
      		}
			else if(n==4) 
			 {
			   System.out.println("It's Wednesday");
      		}
			else if(n==5) 
			 {
			   System.out.println("It's Thursday");
      		}
			else if(n==6) 
			 {
			   System.out.println("It's Friday");
      		}
			else if(n==7) 
			 {
			   System.out.println("It's Saturday");
      		}
			else 
				{
					System.out.println("Invalid Number.Enter number between 1-7");
				}
			}
	   }
	}
	
 

