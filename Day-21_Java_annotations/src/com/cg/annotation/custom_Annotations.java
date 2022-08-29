package com.cg.annotation;

@interface custom
{
	//single Annotations:
	String  print();
}

class B
{
	@ custom (print="hello students:")
	public void display()
	{
		System.out.println();
		
	}
	
}
public class custom_Annotations
{

	public static void main(String[] args) 
	{
		B b=new B();
		b.display();
	}

}