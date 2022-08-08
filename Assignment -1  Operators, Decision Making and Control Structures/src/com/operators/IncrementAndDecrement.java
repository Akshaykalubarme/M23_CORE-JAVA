package com.operators;

public class IncrementAndDecrement {

	public static void main(String[] args) {
	
	    int a = 10;
        int b = ++a;              //PreIncrement
    
        System.out.println(b);
        
        int a1 = 10;
        int b1 = a1++;           //PostIncrement
    
        System.out.println(b1);
        
        int x = 20;
        int y = --x;             //PreDecrement
    
        System.out.println(y);
        
        int c = 20;
        int d = c--;             //PostDecrement
    
        System.out.println(d);


	}

}
