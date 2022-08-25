package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class FilterExapmle {

	public static void main(String[] args) {
		List<String> obj1=Arrays.asList(new String[] {"Akshay","Sapna","Vaibhav","Roh"});
		// to return the string whose length is greater than 3
		obj1.stream().filter(i->i.length()>3).forEach((i)->System.out.print(i+" "));

	}

}
