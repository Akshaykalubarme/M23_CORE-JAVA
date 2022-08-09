package com.cg.superkeyword;
//program on Super Constructor
class Android
{
	Android()
	{
	System.out.println(" Vivo is Android Mobile");
	}
	
}
class Vivo extends Android
{
	Vivo()
	{
		//Android class constructor
		super();
		System.out.println("Hellow EveryOne");
	}
	
}
public class SuperConstructor{
	public static void main(String[] args) {
	
		@SuppressWarnings("unused")
		Vivo v=new Vivo();

	}

}
