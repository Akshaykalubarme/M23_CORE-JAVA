package com.cg.operators;

public class BitwiseOperatorAndShiftingOperator {

	public static void main(String[] args) {
		
        int a = 5;
        int b = 7;
 
        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));
 
        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));
 
        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

       
        int x = 5;
        System.out.println(x >> 1);     // Right Shift
 
      
        int y = 7;
        System.out.println(y << 1);     // Left shift
	}
}


