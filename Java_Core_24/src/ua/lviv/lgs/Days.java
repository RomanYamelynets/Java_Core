package ua.lviv.lgs;

import java.io.Serializable;
import java.util.Scanner;

public enum Days implements Serializable {
	MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

	int serialNumber;

	Days(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public String toLiteral(boolean fullType) {
		String dayToLiteralFull;
		String dayToLiteralShort;

		switch (Days.this) {
		case MONDAY:
			dayToLiteralFull = "MONDAY";
			dayToLiteralShort = "Mon.";
			break;
		case TUESDAY:
			dayToLiteralFull = "TUESDAY";
			dayToLiteralShort = "Tue.";
			break;
		case WEDNESDAY:
			dayToLiteralFull = "WEDNESDAY";
			dayToLiteralShort = "Wed.";
			break;
		case THURSDAY:
			dayToLiteralFull = "THURSDAY";
			dayToLiteralShort = "Thu.";
			break;
		case FRIDAY:
			dayToLiteralFull = "FRIDAY";
			dayToLiteralShort = "Fri.";
			break;
		case SATURDAY:
			dayToLiteralFull = "SATURDAY";
			dayToLiteralShort = "Sat.";
			break;
		case SUNDAY:
			dayToLiteralFull = "SUNDAY";
			dayToLiteralShort = "Sun.";
			break;
		default:
			dayToLiteralFull = dayToLiteralShort = "";
			break;
		}
		
		if (fullType)
			return dayToLiteralFull;
		else
			return dayToLiteralShort;
	}

	public static Days inputDay() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Integer returnedNumber = 0;
		Days foundDay = null;

		System.out.print("Enter the number of the day of the week: ");
		if (scanner.hasNextInt()) {
			int nextInt = scanner.nextInt();

			if (nextInt > 0 && nextInt <= Days.values().length) {
				returnedNumber = nextInt;
			} else
				System.err.println("The number must be between 1 and 7!\n");
		} else
			System.err.println("The number of the day of the week was entered incorrectly\n");

		for (Days day : Days.values()) {
			if (day.getSerialNumber() == returnedNumber) {
				foundDay = day;
			}
		}

		return foundDay;
	}
}