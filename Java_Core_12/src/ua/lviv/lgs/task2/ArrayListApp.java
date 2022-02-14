package ua.lviv.lgs.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ArrayListApp {

	static void menu() {
		System.out.println("Press 1 to check if such a month exists");
		System.out.println("Press 2 to display all months with the same time of year");
		System.out.println("Press 3 to display all months that have the same number of days");
		System.out.println("Press 4 to display all months with fewer days");
		System.out.println("Press 5 to display all months with more days");
		System.out.println("Press 6 to display the next season");
		System.out.println("Press 7 to display the previous season");
		System.out.println("Press 8 to display all months with an even number of days");
		System.out.println("Press 9 to display all months that have an odd number of days");
	}

	public static void main(String[] args) {
		List<Month> monthsList = new ArrayList<>();
		monthsList.add(new Month("JANUARY", 31, Seasons.WINTER));
		monthsList.add(new Month("FEBRUARY", 28, Seasons.WINTER));
		monthsList.add(new Month("MARCH", 31, Seasons.SPRING));
		monthsList.add(new Month("APRIL", 30, Seasons.SPRING));
		monthsList.add(new Month("MAY", 31, Seasons.SPRING));

		Scanner scan = new Scanner(System.in);

		while (true) {
			menu();

			switch (scan.next()) {
			case "1": {
				System.out.println("Enter the name of the month");
				scan = new Scanner(System.in);
				String month = scan.next().toUpperCase();

				boolean flag = isMonthsPresent(monthsList, month);
				if (!flag) {
					System.out.println("There is no such month");
				}

				break;
			}
			case "2": {
				System.out.println("Enter the name of the season");
				scan = new Scanner(System.in);
				String season = scan.next().toUpperCase();

				boolean flag = false;
				for (Month m : monthsList) {
					if (m.getSeasons().name().equals(season)) {
						flag = true;
					}
				}

				if (flag) {
					Seasons s = Seasons.valueOf(season);
					
					for (Month mon : monthsList) {
						if (mon.getSeasons().toString().equalsIgnoreCase(season)) {
							System.out.println(mon);
						} 
					}
				}

				if (!flag) {
					System.out.println("There is no such season");
				}

				break;

			}

			case "3": {
				System.out.println("Enter the number of days in the month");
				scan = new Scanner(System.in);
				int day = scan.nextInt();

				boolean flag = false;
				for (Month m : monthsList) {
					if (m.getDay() == day) {
						flag = true;
					}
				}

				if (flag) {

					for (Month mon : monthsList) {
						if (mon.getDay() == day) {
							System.out.println(mon);
						}
					}
				}

				if (!flag) {
					System.out.println("There are not that many days");
				}

				break;

			}

			case "4": {
				System.out.println("Enter the number of days in the month");
				scan = new Scanner(System.in);
				int day = scan.nextInt();

				boolean flag = false;
				for (Month m : monthsList) {
					if (m.getDay() == day) {
						flag = true;
					}
				}

				if (flag) {

					for (Month mon : monthsList) {
						if (mon.getDay() < day) {
							System.out.println(mon);
						}
					}
				}

				if (!flag) {
					System.out.println("There are not that many days");
				}

				break;

			}
			case "5": {
				System.out.println("Enter the number of days in the month");
				scan = new Scanner(System.in);
				int day = scan.nextInt();

				boolean flag = false;
				for (Month m : monthsList) {
					if (m.getDay() == day) {
						flag = true;
					}
				}

				if (flag) {

					for (Month mon : monthsList) {
						if (mon.getDay() > day) {
							System.out.println(mon);
						}
					}
				}

				if (!flag) {
					System.out.println("There are not that many days");
				}

				break;

			}

			case "6": {
				System.out.println("Enter the name of the season");
				scan = new Scanner(System.in);
				String season = scan.next().toUpperCase();

				boolean flag = false;
				for (Month m : monthsList) {
					if (m.getSeasons().name().equals(season)) {
						flag = true;
					}
				}

				if (flag) {
					Seasons s2 = Seasons.valueOf(season);
					int ordinal = s2.ordinal();

					Seasons[] masS = Seasons.values();

					if (ordinal == (masS.length - 1)) {
						ordinal = 0;
						System.out.println(masS[ordinal]);
					} else {
						System.out.println(masS[ordinal + 1]);
					}

				}

				if (!flag) {
					System.out.println("There is no such season");
				}

				break;

			}
			case "7": {
				System.out.println("Enter the name of the season");
				scan = new Scanner(System.in);
				String season = scan.next().toUpperCase();

				boolean flag = false;
				for (Month m : monthsList) {
					if (m.getSeasons().name().equals(season)) {
						flag = true;
					}
				}

				if (flag) {
					Seasons s3 = Seasons.valueOf(season);
					int ordinal = s3.ordinal();

					Seasons[] masS = Seasons.values();

					if (ordinal == 0) {
						ordinal = (masS.length - 1);
						System.out.println(masS[ordinal]);
					} else {
						System.out.println(masS[ordinal - 1]);
					}

				}

				if (!flag) {
					System.out.println("There is no such season");
				}

				break;

			}
			case "8": {
				for (Month mon : monthsList) {
					if (mon.getDay() % 2 == 0) {
						System.out.println(mon);
					}
				}

				break;
			}
			case "9": {
				for (Month mon : monthsList) {
					if (mon.getDay() % 2 != 0) {
						System.out.println(mon);
					}
				}

				break;
			}
		

			}

		}

	}

	private static boolean isMonthsPresent(List<Month> monthsList, String month) {
		boolean flag = false;

		for (Month m : monthsList) {
			if (m.getName().equals(month)) {
				System.out.println("There is no such month");
				flag = true;
			}
		}
		return flag;
	}

}
