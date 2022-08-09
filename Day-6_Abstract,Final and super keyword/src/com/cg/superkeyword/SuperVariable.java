package com.cg.superkeyword;

class color
{
	protected String name="orange";
	protected void display()
	{
		System.out.println("Color is: "+name);
	}

}
class Blue extends color
{
	public String name="Blue";
	public void display()
	{
		System.out.println("Color is: "+name);
		//Super keyword is used to refer to parent class variable
		System.out.println(super.name);
	}
	
}
public class SuperVariable{
	
	public static void main(String[] args) {
		Blue b=new Blue();
		b.display();
		System.out.println(b.name);
		
	}
}
