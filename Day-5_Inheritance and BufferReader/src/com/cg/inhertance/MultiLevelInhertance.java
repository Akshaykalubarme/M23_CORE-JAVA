package com.cg.inhertance;
//Program on MultiLevelInhertance
class Bike
{
	protected int speed;
	void display()
	{
		System.out.println("I like to drive the Bike");
	}
	
}
class Pulser extends Bike
{
	protected String color;
	void print()
	{
		System.out.println("Speed is: "+speed);
    }
}
class Pulser125 extends Bike
{
	public String color;

	void accept()
	{
		
		System.out.println("Color is: "+"color");
	}
	
}

public class MultiLevelInhertance {

	public static void main(String[] args) {
		Pulser125 p=new Pulser125();
		p.color="Black";
		p.speed=80;
		p.accept();
		p.display();
	
		

	}

}
