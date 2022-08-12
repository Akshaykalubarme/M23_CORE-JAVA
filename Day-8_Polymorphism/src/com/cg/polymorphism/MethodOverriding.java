package com.cg.polymorphism;
// Program on Method Overriding
// one class is not enough create two or more class which contain inheritance concept
class Multiplaction
{
	void accept(int a, int b)
	{
		System.out.println(a*b);
	}
	
}
class Muls extends Multiplaction
{
	void accept(int x, int y)
	{
		System.out.println(x*y);
		
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		Muls m=new Muls();
		m.accept(4, 5);
		Multiplaction m1=new Multiplaction();
		m1.accept(6, 7);

	}
}
