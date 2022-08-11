package com.cg.abstractkeyword;
//abstract class
abstract class Flower 
{
	//abstract method
	abstract void print();
	//Non-abstract method
	void accept()
	{
		System.out.println("Demo on Abstract keyword");
	}
	public void display() {
		
	}
}
class Lily extends Flower
	{
		void print()
		{
			System.out.println("Hey Folks, I like the fragnance of Lily");
		}
	}
public class AbstractClass{
	public static void main(String[] args) {
        // we can't create the object for abstract class
		//Flower f=new Flower();
		Flower l=new Lily();
		l.print();
		l.display();
		
		
		
		
	}

}
