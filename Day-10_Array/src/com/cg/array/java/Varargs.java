package com.cg.array.java;

public class Varargs {
	
	//varaible arguments....(ellipse)
	static void print(int a, int b, String...s)
	{
		System.out.println(a+","+b);
		//To print Varaags
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]+"\t");
		}
	}

	public static void main(String[] args) {
		//Function call
		print(13,25,"Python","Java","C++");
		

	}

}
