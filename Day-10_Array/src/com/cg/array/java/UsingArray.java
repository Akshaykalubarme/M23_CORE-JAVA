package com.cg.array.java;
//Program on using Array
import java.util.Arrays;

public class UsingArray {
	static void display(int...a)
	{
		//Array.sort define Array is a class and sort is a mehod which sort the value
		Arrays.sort(a);
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		display(12,6,88,9,23,56,71);
		}
	}


