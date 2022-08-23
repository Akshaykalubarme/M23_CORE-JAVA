package com.cg.generic;
//Generic Class Example
public class GenericClassExample <T> {
	
	T num;
	public void show()
	{
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		
		GenericClassExample<Double> obj=new GenericClassExample<Double>();
		obj.num=12.5;
		obj.show();
		

	}

}
