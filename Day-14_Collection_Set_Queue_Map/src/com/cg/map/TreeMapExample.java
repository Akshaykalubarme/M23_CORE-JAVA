package com.cg.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
		NavigableMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(12,"Akshay");
		map.put(14,"Vishal");
		map.put(11,"Amol");
		map.put(20,"Sapna");
		map.put(18,"Vaibhav");
		map.put(17,"Aditya");
		
		System.out.println(map.firstKey());

		System.out.println(map.firstEntry());
		System.out.println(map.lastKey());

		System.out.println(map.lastEntry());
		System.out.println(map);
		
		

	}

}
