package com.cg.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;

public class CompareableLambda {
	public static void main(String[] args) 
	{
		//Comparator<String> obj=(str1,str2) ->Integer.compare(str1.length(),str2.length());
		
	    //	String  str[]= {"hjk","as","fd"};
		//Collections.sort(Arrays.asList(str),obj);
		//for(String i:str)
		//{
		//System.out.println(i);
		//}
		ArrayList<String > obj=new ArrayList<String> ();
		
		obj.add("Akshay");
		obj.add("Vaibhav");
		Collections.sort(obj);
		
		for(String i:obj)
		{
			System.out.println(i);
		}
		
	}


}
