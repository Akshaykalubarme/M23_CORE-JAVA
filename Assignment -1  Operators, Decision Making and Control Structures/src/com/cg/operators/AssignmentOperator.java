package com.cg.operators;

// Program on Assignment operator
public class AssignmentOperator {
//Program on 
	public static void main(String[] args) {
		
        // = 
		int num = 10;
		String name ="Akshay";
		System.out.println("num is assigned: "+ num);
		System.out.println("name is assigned: "+ name);  
		
		// +=
		double a = 10;
		double b = 20;
		a += b;
		System.out.println("a = "+ a);
		
		
		// -=
		int x = 10;
		int y = 20;
		x -= y;
		System.out.println("x = "+ x);
		
		// *=
		int a1 = 5;
		int b1 = 20;
		a1 *= b1;
		System.out.println("a1 = "+ a1);
		
		// /=
		int p = 10;
		int q = 20;
		p /= q;
		System.out.println("p = "+ p);
		
		// %=
		int m = 10;
		int n = 20;
		m %= n;
		System.out.println("m = "+ m);
	}

}
