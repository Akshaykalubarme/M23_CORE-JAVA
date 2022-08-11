package com.cg.polymorphism;
// Program on Method of arguments
class Shape
{
	// By changing numbers of arguments
	int area(int a) // one argument
	{
		return a*a;
	}
	int area(int a,int b)// Two arguments
	{
		return a*b;
	}
	
}
public class MethodOverloading {

	public static void main(String[] args) {
	
		Shape s=new Shape();
		System.out.println(s.area(5));
		System.out.println(s.area(10,20));
		

	}

}
