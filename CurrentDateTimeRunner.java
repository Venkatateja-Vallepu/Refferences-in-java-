package com.cashapona.Refferences.jun7;
//* import LocalDate, LocalTime, LocalDateTime, DateTimeFormatter classes

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/**
*/
public class CurrentDateTimeRunner {
	/*
	 * create currentDate() method, to display current date(year,month,day)
	 */
	public static void currentDate() {
		/*
		 * create a date object for LocalDate class, use method now() of that class
		 */
		LocalDate date=LocalDate.now();
		/*
		 * display current date
		 */
		System.out.println("Current Date : "+date);
	}
	/*
	 * create currentTime () method, to display current time(hour,minute,sec,nanoseconds)
	 */
	public static void currentTime() {
		/*
		 * create a time object for LocalTime class, use method now() of that class
		 */
		LocalTime time=LocalTime.now();
		/*
		 * display current date
		 */
		System.out.println("Current Time : "+time);
	}
	/*
	 * create currentDateTime () method, to display current time(hour,minute,sec,nanoseconds) and current date(year,month,day)
	 */
	public static void currentDateTime() {
		/*
		 * create a dateTime object for LocalDateTime class, use method now() of that class
		 */
		LocalDateTime dateTime=LocalDateTime.now();
		/*
		 * display current date
		 */
		System.out.println("Current date and time : "+dateTime);
	}
	/*
	 * to seperate date from time using DateTimeFormatter with ofPattern() method
	 */
	public static void dateTimeFormatter() {
		/*
		 * create a dateTime object for LocalDateTime class, use method now() of that class
		 */
		LocalDateTime dateTime=LocalDateTime.now();
		/*
		 * display current date
		 */
		System.out.println("Before formatting Current date and time : "+dateTime);
		
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-mm-yyyy  hh:mm:ss");
		DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("E, dd-MM-yyyy, hh:mm:ss");
		DateTimeFormatter dateTimeFormatter2=DateTimeFormatter.ofPattern("E, dd/MMM/yyyy, hh:mm:ss");	
		DateTimeFormatter dateTimeFormatter3=DateTimeFormatter.ofPattern("E, yyyy-MMM-dd, hh:mm:ss");

		String formattedDateTime =dateTime.format(dateTimeFormatter);
		String formattedDateTime1 =dateTime.format(dateTimeFormatter1);
		String formattedDateTime2 =dateTime.format(dateTimeFormatter2);
		String formattedDateTime3=dateTime.format(dateTimeFormatter3);

		System.out.println("After formating date and time in different formates : ");
		System.out.println(formattedDateTime);
		System.out.println(formattedDateTime1);
		System.out.println(formattedDateTime2);
		System.out.println(formattedDateTime3);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//calling currentDate(), currentTime(),currentDateTime()
		currentDate();
		currentTime();
		currentDateTime();
		dateTimeFormatter();
	}


}
