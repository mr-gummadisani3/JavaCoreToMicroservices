package com.mrgummadisani.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAndTimeExample {

	public static void main(String[] args) {
		// replace legacy date and calender classes
		
		LocalDate localDate=LocalDate.now();
		
		System.out.println(localDate);
		
		  String formattedDate = localDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		System.out.println(formattedDate);

	}

}
