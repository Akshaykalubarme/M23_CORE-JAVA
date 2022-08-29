package com.cg.enums;

import java.util.Scanner;

enum Movie
{
	KGF2,BRAHMASHTRA,PUSPA,MAJOR;
}

public class EnumWithSwitchCase 
{
	//enum varibale
	Movie movie;
	//constructor for the "EnumWithSwitchCase "
	public EnumWithSwitchCase(Movie movie)
	{
		//as Enum and constructorargument var is same -'is this keyword
		this .movie=movie;
	}
	public void display()
	{
		switch (movie)
		{
		case KGF2:
			System.out.println("Yash and Srinidhi shetty");
			break;
		case BRAHMASHTRA:
			System.out.println("Allu Arjun and Rashkima");
			break;
		case PUSPA:
			System.out.println("Ranbir kapoor and Alia Bhatt");
			break;
		case MAJOR:
			System.out.println("Adivi and Saiee Manjrekar");
			break;
		default:
			System.out.println("Invalid movie name");
		
		}
	}
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the movie that u want to display");
		String str=s.nextLine();
		//valueof():- to get the constant whose value is passed as an argument
		EnumWithSwitchCase obj=new EnumWithSwitchCase(Movie.valueOf(str));

	}

}
