package com.Dibyanshu.Assignments.SwitchCase;

import java.util.Scanner;

public class SwitchCase2 
 {
	public static void main(String[] args) 
	 {
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of month between 1-12 to find days");
			int n  = sc.nextInt();
			switch (n) 
			 {
			    case 1: 
			    {
			    	String month = "January";
			    	System.out.println("Number of days in " + month + " is 31");
			    	break;
			    }
			    case 2: 
			    {
			    	String month = "Febrauary";
			    	System.out.println("Number of days in " + month + " is 28");
			    	break;
			    }
			    case 3: 
			    {
			    	String month = "March";
			    	System.out.println("Number of days in " + month + " is 31");
			    	break;
			    }
			    case 4: 
			    {
			    	String month = "April";
			    	System.out.println("Number of days in " + month + " is 30");
			    	break;
			    }
			    case 5: 
			    {
			    	String month = "May";
			    	System.out.println("Number of days in " + month + " is 31");
			    	break;
			    }
			    case 6: 
			    {
			    	String month = "June";
			    	System.out.println("Number of days in " + month + " is 30");
			    	break;
			    }
			    case 7: 
			    {
			    	String month = "July";
			    	System.out.println("Number of days in " + month + " is 31");
			    	break;
			    }
			    case 8: 
			    {
			    	String month = "August";
			    	System.out.println("Number of days in " + month + " is 31");
			    	break;
			    }
			    case 9: 
			    {
			    	String month = "September";
			    	System.out.println("Number of days in " + month + " is 30");
			    	break;
			    }
			    case 10: 
			    {
			    	String month = "October";
			    	System.out.println("Number of days in " + month + " is 30");
			    	break;
			    }
			    case 11: 
			    {
			    	String month = "November";
			    	System.out.println("Number of days in " + month + " is 30");
			    	break;
			    }
			    case 12: 
			    {
			    	String month = "December";
			    	System.out.println("Number of days in " + month + " is 31");
			    	break;
			    }
			    default:
					 throw new IllegalArgumentException("Unexpected value: " + n);
				}
		}
	}
		
}


		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		    
		    
		
		   