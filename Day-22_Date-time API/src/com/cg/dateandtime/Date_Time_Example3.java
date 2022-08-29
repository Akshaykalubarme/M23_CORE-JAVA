package com.cg.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Example3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		LocalDateTime str=LocalDateTime.now();
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String str1=str.format(dtf);
		System.out.println();


	}

}
