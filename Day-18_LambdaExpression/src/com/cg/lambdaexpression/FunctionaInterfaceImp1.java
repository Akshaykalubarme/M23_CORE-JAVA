package com.cg.lambdaexpression;

interface A
{
	void show();
	
}
//Length of code increase using Implementation class B
class B implements A
{

	@Override
	public void show() {
		System.out.println("Funcational program on implements funcation interface using lambda");
		
	}
	
}


public class FunctionaInterfaceImp1 {
	public static void main(String[] args) {
		//B b=new B();
	   //b.show();
		//1.lambda expression implements the functional interface
		//Length of code decrease uding lambda expression
		A obj=() ->
		{
			System.out.println("Funcational program on implements funcation interface using lambda");
		};
		obj.show();
		}


}

