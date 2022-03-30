package ua.lviv.lgs.taks2;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Application {

	public static void main(String[] args) {
		ZoneId defaultZoneId = ZoneId.systemDefault();
		System.out.println("System Default TimeZone : " + defaultZoneId);
		System.out.println();
		
		Date date = new Date();
		System.out.println("date : " + date);
		System.out.println();
		
		Instant instant = date.toInstant();
		System.out.println("instant : " + instant);
		System.out.println();
		
		LocalDate localDate = instant.atZone(defaultZoneId).toLocalDate();
		System.out.println("localDate : " + localDate);

		
		LocalTime localTime = instant.atZone(defaultZoneId).toLocalTime();
		System.out.println("localTime : " + localTime);


		ZonedDateTime zoneDateTime = instant.atZone(defaultZoneId);
		System.out.println("localDateTime : " + zoneDateTime);

		

	}

}
