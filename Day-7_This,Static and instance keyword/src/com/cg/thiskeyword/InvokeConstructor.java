package com.cg.thiskeyword;
// this() : to improve current class constructor
class Z 
{
	public int x;
	//Default constructor
	Z()
	{
		this(23); // Invoking the parameterized
		System.out.println("Default Constructor");
	}
	 Z(int i) {
	
	}
	void Z1()
	{
		System.out.println("Value is: "+x);
	}
}
public class InvokeConstructor {
	
	public static void main(String[] args) {
	
	@SuppressWarnings("unused")
	Z obj=new Z();
	}
}