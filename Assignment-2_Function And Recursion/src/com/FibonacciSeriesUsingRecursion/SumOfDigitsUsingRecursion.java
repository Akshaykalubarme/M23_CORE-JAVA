package com.FibonacciSeriesUsingRecursion;

import java.util.Scanner;

public class SumOfDigitsUsingRecursion {
	
    // of digit using recursion
    static int sum_of_digit(int num)
    {
        if (num == 0)
            return 0;
        return (num % 10 + sum_of_digit(num / 10));
    }
 
   
    @SuppressWarnings("resource")
	public static void main(String args[])
    {
    	 Scanner cs=new Scanner(System.in);
         int num = 0;
		 System.out.print("Enter the N value:");
		 num=cs.nextInt();
        int result = sum_of_digit(num);
        System.out.println("Sum of digits is: " + result);
    }
	

	}


