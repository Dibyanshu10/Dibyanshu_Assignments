package com.Dibyanshu.Assignments.SwitchCase;

import java.util.Scanner;

public class SwitchCase1 
 {
	public static void main(String[] args) 
	 {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Number between 1 - 7 to find days of week");
			int n = sc.nextInt();
			switch (n) 
			 {
			    case 1: 
			    {
			    	System.out.println("Sunday");
			    	break;
			    }
			    case 2: 
			    {
			    	System.out.println("Monday");
			    	break;
			    }
			    case 3: 
			    {
			    	System.out.println("Tuesday");
			    	break;
			    }
			    case 4: 
			    {
			    	System.out.println("Wednesday");
			    	break;
			    }
			    case 5: 
			    {
			    	System.out.println("Thursday");
			    	break;
			    }
			    case 6: 
			    {
			    	System.out.println("Friday");
			    	break;
			    }
			    case 7: 
			    {
			    	System.out.println("Saturday");
			    	break;
			    }
			
			   default:
				 throw new IllegalArgumentException("Unexpected value: " + n);
			}
		}
		
	}

}
