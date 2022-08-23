package com.cg.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsAdvantagesDemo {

	public static void main(String[] args) {
		
		List<Integer> obj=new ArrayList<Integer>();
		
		obj.add(12);
		//obj.add("Str"); complie time checking : type safe
		
		System.out.println(obj);
		
		List<String> obj1=new LinkedList<String> ();
		obj1.add("Akshay");
		obj1.add("Sapna");
		//type castong is not required
		String str=obj1.get(1);
		System.out.println(str);
		
	}
}


