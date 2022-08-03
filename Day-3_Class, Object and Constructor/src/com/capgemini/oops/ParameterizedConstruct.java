package com.capgemini.oops;

class Pulser
{ 
	//class var
	public int speed;
	public String color;
	//Parameterized Constructor
	/*Pulser(int speed,String color)
	{
		speed=50;
		color="White";
	}*/
	//NonParameterized Constructor
	Pulser()
	{
		System.out.println("Welcome To TechnoServe India");
	}//Parameterized Constructor
	Pulser(int sp, String col)
	{
		speed=sp;
		color=col;
	}
	void accept()
	{
		System.out.println("Speed is:"+speed+"km/hr" +" and color is: "+color);
	}
}
public class ParameterizedConstruct {

	public static void main(String[] args) {
	
		Pulser p=new Pulser(50,"Black");
		p.accept();

	}

}
