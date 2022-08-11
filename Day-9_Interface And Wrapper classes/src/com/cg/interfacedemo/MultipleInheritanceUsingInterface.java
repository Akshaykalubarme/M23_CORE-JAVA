package com.cg.interfacedemo;
//Program on Multiple Inheritance using interface
interface Father
{
	void property();
	
}
interface Mother
{
	void Love();
	
}
class Daughter implements Father,Mother {
	
	public void Love()
	{
		System.out.println("Mother Loves the child");
	}
	public void property()
	{
		System.out.println("Father gives propety to child");
	}
}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
	
		Daughter d=new Daughter();
		d.Love();
		d.property();

	}

}
