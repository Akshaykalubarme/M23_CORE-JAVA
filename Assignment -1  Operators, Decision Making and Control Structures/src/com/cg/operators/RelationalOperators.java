package com.cg.operators;

import java.util.Scanner;

public class RelationalOperators {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	       int a=sc.nextInt();
	       int b=sc.nextInt();
	  
	      System.out.println("a == b = " + (a == b));
	      System.out.println("a != b = " + (a != b));
	      System.out.println("a > b = " + (a > b) );
	      System.out.println("a < b = " + (a < b) );
	      System.out.println("b >= a = " + (b >= a));
	      System.out.println("b <= a = " + (b <= a));
		}
	}
