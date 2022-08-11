package com.cg.thiskeyword;

class B
{
	public void accepet1(B b)
	{
		System.out.println("Accept Method");
	}
	public void accepet2()
	{
		accepet1(this);
	}
}
public class ArgumentForMethodCall {

	public static void main(String[] args) {
	B b=new B();
	b.accepet1(b);
}
}

