package com.cg.excptionhandling;

import java.io.IOException;

public class Throw_Block {

		static	void display()
		{
			try
			{
				System.out.println("Inside display method");
				throw new RuntimeException("Demo");
			}
			finally
			{
				System.out.println("Finally block is always exceuted");	
			}
		}
		public static void main(String[] args) throws ClassNotFoundException, IOException {
			try
			{
				display();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

		}

	}
