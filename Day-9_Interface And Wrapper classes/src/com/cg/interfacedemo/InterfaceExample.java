package com.cg.interfacedemo;
//Program on interface
 interface A
 {
	 void print();
	 void display();
	 
 }
 class B implements A
 {
	 public void print()
	 {
		 System.out.println("Technoserve India Foundation");
	 }
	 public void display()
	 {
		 System.out.println("Java Full Stack");
	 }
 }
 public class InterfaceExample{
	 
	 public static void main(String[] args) {
		 B b=new B();
		 b.print();
		 b.display();
	

	}

}
