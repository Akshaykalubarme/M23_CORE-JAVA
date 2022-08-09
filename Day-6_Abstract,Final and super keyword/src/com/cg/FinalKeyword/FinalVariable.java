package com.cg.FinalKeyword;
//Program on Final Variable
public class FinalVariable {

	final int FIN_VAR = 45;
	/* Public void print()
	{
		// If any variable is declare as a final we can't change the vale of that variable
		 
		  FIN_VAR =76;
		 
	}*/
	
	public static void main(String[] args) {
	
		FinalVariable f=new FinalVariable();

		System.out.println(f.FIN_VAR);
	}

}
