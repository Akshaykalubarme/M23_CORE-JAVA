package com.operators;

import java.util.Scanner;

public class LogicalOperator {

	
	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
	       int a=sc.nextInt();
	       int b=sc.nextInt();
	       int c=sc.nextInt();
	       sc.close();
		    // Logical AND
	        if ((a < b) && (b > c)) {
	          
	            System.out.println("True conditions");
	        }
	        else
	            System.out.println("False conditions");

	        
	        // Logical OR
	        if ((a < b) || (b > c)) {
	          
	            System.out.println("True conditions");
	        }
	        else
	            System.out.println("False conditions");
	        
	        
	        
		     // Logical NOT
		     if ((a < b) != (b > c)) {
		          
		         System.out.println("True conditions");
		      }
		      else
	              System.out.println("False conditions");
	}

}
