package com.capgemini.oops;
 class Animal
 {
	 int x;
	 // NonParameterizedConstruct
	 Animal()
	 {
		 x=15;
	 }
	 void display()
	 {
		 System.out.println("Loin"+" "+x);
	 }
 }
public class NonParameterizedConstruct {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.display();

	}

}
