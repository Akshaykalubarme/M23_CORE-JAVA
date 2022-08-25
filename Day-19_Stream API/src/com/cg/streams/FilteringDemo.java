package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class FilteringDemo {

	public static void main(String[] args) {

		List<Integer> obj=Arrays.asList(5,11,22,33,5,44);
		//filter (pridecticate)method
		obj.stream().filter(i->i>15).forEach((i)->System.out.print(i+" "));
		System.out.println();
		System.out.println("The distinct elements are: ");
		obj.stream().distinct().forEach((i)->System.out.print(i+" "));
		System.out.println();
		System.out.println("The limit elements are: ");
		obj.stream().limit(3).forEach((i)->System.out.print(i+" "));
		System.out.println();
		System.out.println("The discarded elements are: ");
		obj.stream().skip(3).forEach((i)->System.out.print(i+" "));
	}

}
