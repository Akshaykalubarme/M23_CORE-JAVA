package com.cg.excptionhandling;

public class NullPointerExceptiongHandling {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String str=null;
		try
		{
			str.equals("JAVA");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(str.equals("JAVA"));
		
		}
	}

}
