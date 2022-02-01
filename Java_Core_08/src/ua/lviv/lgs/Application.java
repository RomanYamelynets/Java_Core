package ua.lviv.lgs;

import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Натисніть 1, щоб перевірити чи такий місяць існує");
		System.out.println("Натисніть 2, щоб вивести всі місяці з такою ж порою року");
		System.out.println("Натисніть 3, щоб вивести всі місяці які мають таку саму кількість днів");
		System.out.println("Натисніть 4, щоб вивести на екран всі місяці які мають меншу кількість днів");
		System.out.println("Натисніть 5, щоб вивести на екран всі місяці які мають більшу кількість днів");
		System.out.println("Натисніть 6, щоб вивести на екран наступну пору року");
		System.out.println("Натисніть 7, щоб вивести на екран попередню пору року");
		System.out.println("Натисніть 8, щоб вивести на екран всі місяці які мають парну кількість днів");
		System.out.println("Натисніть 9, щою вивести на екран всі місяці які мають непарну кількість днів");
		System.out.println("Натисніть 10, щоб вивести на екран чи введений з консолі місяць має парну кількість днів");
	}

	public static void main(String[] args) {
		Months[] mas = Months.values();

		Scanner scan = new Scanner(System.in);

		while (true) {
			menu();

			switch (scan.next()) {
			case "1": {
				System.out.println("Введіть назву місяця");
				scan = new Scanner(System.in);
				String month = scan.next().toUpperCase();

				boolean flag = isMonthsPresent(mas, month);
				if (!flag) {
					System.out.println("Такий місяць не існує");
				}

				break;
			}
			case "2": {
				System.out.println("Введіть назву сезона");
				scan = new Scanner(System.in);
				String season = scan.next().toUpperCase();

				boolean flag = false;
				for (Months m : mas) {
					if (m.getSeason().name().equals(season)) {
						flag = true;
					}
				}

				if (flag) {
					Seasons s = Seasons.valueOf(season);

					for (Months mon : mas) {
						if (mon.getSeason().toString().equalsIgnoreCase(season)) {
							System.out.println(mon);
						}
					}
				}

				if (!flag) {
					System.out.println("Такий сезон не існує");
				}

				break;

			}

			case "3": {
				System.out.println("Введіть кількість днів в місяці");
				scan = new Scanner(System.in);
				int day = scan.nextInt();

				boolean flag = false;
				for (Months m : mas) {
					if (m.getDay() == day) {
						flag = true;
					}
				}

				if (flag) {

					for (Months mon : mas) {
						if (mon.getDay() == day) {
							System.out.println(mon);
						}
					}
				}

				if (!flag) {
					System.out.println("Такої кількості днів не існує");
				}

				break;

			}

			case "4": {
				System.out.println("Введіть кількість днів в місяці");
				scan = new Scanner(System.in);
				int day = scan.nextInt();

				boolean flag = false;
				for (Months m : mas) {
					if (m.getDay() == day) {
						flag = true;
					}
				}

				if (flag) {

					for (Months mon : mas) {
						if (mon.getDay() < day) {
							System.out.println(mon);
						}
					}
				}

				if (!flag) {
					System.out.println("Такої кількості днів не існує");
				}

				break;

			}
			case "5": {
				System.out.println("Введіть кількість днів в місяці");
				scan = new Scanner(System.in);
				int day = scan.nextInt();

				boolean flag = false;
				for (Months m : mas) {
					if (m.getDay() == day) {
						flag = true;
					}
				}

				if (flag) {

					for (Months mon : mas) {
						if (mon.getDay() > day) {
							System.out.println(mon);
						}
					}
				}

				if (!flag) {
					System.out.println("Такої кількості днів не існує");
				}

				break;

			}

			case "6": {
				System.out.println("Введіть назву сезона");
				scan = new Scanner(System.in);
				String season = scan.next().toUpperCase();

				boolean flag = false;
				for (Months m : mas) {
					if (m.getSeason().name().equals(season)) {
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
					System.out.println("Такий сезон не існує");
				}

				break;

			}
			case "7": {
				System.out.println("Введіть назву сезона");
				scan = new Scanner(System.in);
				String season = scan.next().toUpperCase();

				boolean flag = false;
				for (Months m : mas) {
					if (m.getSeason().name().equals(season)) {
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
					System.out.println("Такий сезон не існує");
				}

				break;

			}
			case "8": {
				for (Months mon : mas) {
					if (mon.getDay() % 2 == 0) {
						System.out.println(mon);
					}
				}

				break;
			}
			case "9": {
				for (Months mon : mas) {
					if (mon.getDay() % 2 != 0) {
						System.out.println(mon);
					}
				}

				break;
			}
			case "10": {
				System.out.println("Введіть назву місяця");
				scan = new Scanner(System.in);
				String month = scan.next().toUpperCase();

				boolean flag = isMonthsPresent(mas, month);
				Months m = Months.valueOf(month);
				if (m.getDay() % 2 == 0) {
					System.out.println("Місяць має парну кількість днів");
				} else {
					System.out.println("Місяць має непарну кількість днів");
				}
					

				if (!flag) {
					System.out.println("Такий місяць не існує");
				}

				break;
			}

			}

		}

	}

	private static boolean isMonthsPresent(Months[] mas, String month) {
		boolean flag = false;

		for (Months m : mas) {
			if (m.name().equals(month)) {
				System.out.println("Такий місяць існує");
				flag = true;
			}
		}
		return flag;
	}

}
