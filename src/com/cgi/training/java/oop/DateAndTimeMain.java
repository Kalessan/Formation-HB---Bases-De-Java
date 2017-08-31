package com.cgi.training.java.oop;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateAndTimeMain {

	public static void main(String[] args) {
		// Date Time API
		
		// Temps machine
		System.out.println(Instant.now()); // represente le nb de sec écoullée depuis l'époch 01/01/1970 
		System.out.println(Instant.ofEpochSecond(200000000));

		// Temps humain
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.of(2017, 8, 31));
		
		System.out.println(LocalTime.now());
		System.out.println(LocalTime.of(2, 30, 10, 5));
		
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.of(2017, 8, 31, 2, 30, 10, 5));
		
		LocalDate date = LocalDate.of(2000, Month.NOVEMBER, 20);
		LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		
		// TimeZones
		for(String z: ZoneId.getAvailableZoneIds()) {
			System.out.println(z);
		}
		
		LocalDateTime leaving = LocalDateTime.of(2013, Month.JULY, 20, 19, 30);
		ZoneId leavingZone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);
	}

}
