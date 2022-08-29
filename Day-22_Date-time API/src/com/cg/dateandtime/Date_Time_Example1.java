package com.cg.dateandtime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date_Time_Example1 {

	public static void main(String[] args) {
	
		LocalDate l= LocalDate.now();
		System.out.println(l);
		
		LocalDate l1= LocalDate.of(2012, 3, 5);
		System.out.println(l1);
		
		
		LocalTime t=LocalTime.now();
		System.out.println(t);
		
		LocalDateTime dt= LocalDateTime.now();
		System.out.println(dt);

	}
}
