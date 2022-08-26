package com.cg.lambdaexpression;
@FunctionalInterface
interface E
{
	int add(int a, int b);// abstract method
	
}
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		/*Lambda experption with retun statements
		E obj=(int a, int b)->
		{
			return a+b;
		};
		System.out.println(obj.add(5, 12));*/
		
		//Lambda experption without retun statements
		E obj=(int a, int b)->(a+b);
		System.out.println("Addition of a and b is: "+obj.add(5, 12));

	}

}
