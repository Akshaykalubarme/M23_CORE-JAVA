package com.cg.regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;
//Demo on matches () method of a pattern class
public class PatternMatchesMethod {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		String pattern="Java Programming";
		String input=s.nextLine();
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);
		

	}

}
