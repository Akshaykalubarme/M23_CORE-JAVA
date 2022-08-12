package com.cg.array.java;

public class ArrayDemo {

	public static void main(String[] args) {
		/*Don't declare sixe at the end if your are initilization arrt
		int arr[]= new int[3] {11,22,33};*/

		int arr[]= new int[] {11,22,33};
		System.out.println(" The array index value is: "+arr[1]);
		//Array index is out of bound exception as index is 3 we are accessing and last index is 2
		System.out.println(" The array index value is: "+arr[3]);
		
		
	}
}
