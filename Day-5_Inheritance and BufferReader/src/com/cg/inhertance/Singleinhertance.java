package com.cg.inhertance;
// Program on SingleInhertance
class Parent
{
	protected int rollno;
	void print()
	{
		System.out.println("Hey's guys !, What is going on...");
	}
	
}
class child extends Parent
{
	void accept()
	{
		System.out.println("Roll no is: "+rollno);
	}
}

public class Singleinhertance {

	public static void main(String[] args) {
		child c=new child();
		c.rollno=3121;
		c.accept();
		c.print();

	}

}
