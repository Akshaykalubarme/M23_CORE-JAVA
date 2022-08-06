package com.Introduction_of_Java;
//program on String input
import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		//next() will take only first word and 
		//nextline() will take entire line
		String str=s.nextLine();
		System.out.println(str);
		

	}

}
