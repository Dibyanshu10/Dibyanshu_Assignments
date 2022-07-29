package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops18 
 {
public static void main(String[] args)
 {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter as number");
		 int n = sc.nextInt(); 
		 int d,t;
		  System.out.println("Frequency of digits");
	        for(int i=0;i<=9;i++)
	        {
	             int count=0;
	             t=n;
	            while(t>0)
	            {
	                d = t%10;
	                if(d==i)
	                {
	                    count++;
	                }
	                t=t/10;
	            }
	            if(count>0)
	            {
	                System.out.println(i+"\t"+count);
	            }
	        }
	    }
	}
		 
}

