package com.cg.inhertance;
// Program on Hierarchical Inheritance
class Android_Version
{
	void display()
	{
		System.out.println("Android-Version");
	}
	
}
class kitkat extends Android_Version
{
	void print()
	{
		System.out.println("I like Kitkat");
	}
	
}
class chocolate extends Android_Version
{
	void print()
	{
		System.out.println("Also i Like chocolate");
	}
	
}
public class HierarchicalInhertance {

	public static void main(String[] args) {
		kitkat k=new kitkat();
		chocolate c=new chocolate();
		k.display();
		k.print();
		c.print();

	
	

	}

}
