package com.ControlStatements;

public class Break {

	public static void main(String[] args) {
		 // int n = 10;
	        for (int i = 0; i < 10; i++) {
	            if (i == 6)
	                break;
	            System.out.println(i);
            } 
	        System.out.println("Out of the For loop");
        }
}
