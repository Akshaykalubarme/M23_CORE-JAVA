package com.cg.streams;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambda {

	public static void main(String[] args) {
	
		Set<Integer> obj=new HashSet<>();
		obj.add(25);
		obj.add(45);
		obj.add(55);
		
		obj.forEach(System.out::println);

	}

}
