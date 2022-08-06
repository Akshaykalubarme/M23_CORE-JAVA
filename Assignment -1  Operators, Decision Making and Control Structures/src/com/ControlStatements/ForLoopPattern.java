package com.ControlStatements;

public class ForLoopPattern {

	public static void main(String[] args) {

		//i for rows and j for columns       
		int i, j, row=5;   
		  for(i=1; i<=row; i++) //outer loop for rows  
			 {   
			  for(j=1; j<=i; j++)   //inner loop for columns 
		     {   
				  System.out.print("@ ");   
		 }   
		     System.out.println();   
	  }   
	}   
}


