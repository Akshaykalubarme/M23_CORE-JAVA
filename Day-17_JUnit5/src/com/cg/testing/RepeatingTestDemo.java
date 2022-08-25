package com.cg.testing;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatingTestDemo 
{
	//It will reoeat the test for 5 times
	@RepeatedTest(5)
	void print()
	{
		System.out.println("Hey Guy's Whats going on");
	}

}
