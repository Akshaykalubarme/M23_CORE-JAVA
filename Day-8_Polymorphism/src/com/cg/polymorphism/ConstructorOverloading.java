package com.cg.polymorphism;
//Program on Constructor OverLoading
class Triber
{
	int speed;
	String engine;
	//Default Constructor
	Triber()
	{
		System.out.println("Renault-kiger");
	}
	//Two parameter
	Triber(int speed, String engine)
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("Speed is: "+speed+"Km/hr" + " and the engine is on: "+engine);
	} 
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Triber t=new Triber();
		@SuppressWarnings("unused")
		Triber t1=new Triber(45,"Engine");
	}

}
