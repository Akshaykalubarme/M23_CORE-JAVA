package com.cg.operators;
//program on Arithmetic Operator
import java.util.Scanner;

public class ArithmeticOperator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
        
		System.out.println(a+b);     //addition of two Numbers 
		System.out.println(a-b);     //Subtraction of two Numbers
		System.out.println(a*b);     //Multiplication of two Numbers
		System.out.println(a/b);     //Division of Two Numbers
		System.out.println(a%b);     //Modules of Two Numbers
	}

}
