package com.cg.lambdaexpression;
//functional interface
interface D 
{
	//abstract method
	String display(String str);
	
	
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		D obj =(String str)->
		{
			return str;
		};
		System.out.println(obj.display("Welcome to Lambda Expression concept"));

	}

}
