package com.cg.regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClassExample {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Pattern p=Pattern.compile("and");
		//Matcher m=p.matcher("Java is Good language to learn and earn the money and I like to learn java");
		System.out.println("Enter the String");
		Matcher m=p.matcher(s.nextLine());
		//it will cheack "and" location until last and it will print
		while(m.find())
		{
			System.out.println("Pattern found from "+m.start()+" to "+(m.end()-1));
		}
		
		

	}

}
