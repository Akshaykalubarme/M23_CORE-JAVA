package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class Mapping {

	public static void main(String[] args) {
		List<String> obj1=Arrays.asList(new String[] {"Akshay","Sapna","Vaibhav","Roh"});
		obj1.stream().map((i->i.length())).forEach((i)->System.out.print(i+" "));

	}

}
