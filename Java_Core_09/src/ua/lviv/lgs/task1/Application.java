/*
 * LOGOS It Academy homework9.
 * Console program to work with Enums.
 * 
 */

package ua.lviv.lgs.task1;

import java.util.Scanner;

/**
 * @since java 1.8
 * @author Roman
 * @version 1.1
 * */

public class Application {

	/* program menu */
	static void menu() {
		System.out.println("�������� 1, ��� ��������� �� ����� ����� ����");
		System.out.println("�������� 2, ��� ������� �� ����� � ����� � ����� ����");
		System.out.println("�������� 3, ��� ������� �� ����� �� ����� ���� ���� ������� ���");
		System.out.println("�������� 4, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 5, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 6, ��� ������� �� ����� �������� ���� ����");
		System.out.println("�������� 7, ��� ������� �� ����� ��������� ���� ����");
		System.out.println("�������� 8, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 9, ��� ������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("�������� 10, ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");
	}

	public static void main(String[] args) throws WrongInputConsoleParametersException {
		Months[] mas = Months.values();

		Scanner scan = new Scanner(System.in);
		
		/* creates an infinite loop */
		while (true) {
			menu();

			switch (scan.next()) {
			case "1": {
				System.out.println("������ ����� �����");
				scan = new Scanner(System.in);
				String month = scan.next().toUpperCase();

				boolean flag = isMonthsPresent(mas, month);
				if (!flag) {
					String message = "����� ����� �� ����";
					throw new WrongInputConsoleParametersException(message);
				}
				

				break;
			}
			case "2": {
				System.out.println("������ ����� ������");
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
					String message = "����� ����� �� ����";
					throw new WrongInputConsoleParametersException(message);
				}

				break;

			}

			case "3": {
				System.out.println("������ ������� ��� � �����");
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
					String message = "���� ������� ��� �� ����";
					throw new WrongInputConsoleParametersException(message);
				}

				break;

			}

			case "4": {
				System.out.println("������ ������� ��� � �����");
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
					String message = "���� ������� ��� �� ����";
					throw new WrongInputConsoleParametersException(message);
				}

				break;

			}
			case "5": {
				System.out.println("������ ������� ��� � �����");
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
					String message = "���� ������� ��� �� ����";
					throw new WrongInputConsoleParametersException(message);
				}

				break;

			}

			case "6": {
				System.out.println("������ ����� ������");
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
					String message = "����� ����� �� ����";
					throw new WrongInputConsoleParametersException(message);
				}

				break;

			}
			case "7": {
				System.out.println("������ ����� ������");
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
					String message = "����� ����� �� ����";
					throw new WrongInputConsoleParametersException(message);
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
				System.out.println("������ ����� �����");
				scan = new Scanner(System.in);
				String month = scan.next().toUpperCase();

				boolean flag = isMonthsPresent(mas, month);
				Months m = Months.valueOf(month);
				if (m.getDay() % 2 == 0) {
					System.out.println("̳���� �� ����� ������� ���");
				} else {
					System.out.println("̳���� �� ������� ������� ���");
				}
					

				if (!flag) {
					String message = "����� ����� �� ����";
					throw new WrongInputConsoleParametersException(message);
				}

				break;
			}

			}

		}

	}
	
	/*  Checks if the month exists in array */

	private static boolean isMonthsPresent(Months[] mas, String month) {
		boolean flag = false;

		for (Months m : mas) {
			if (m.name().equals(month)) {
				System.out.println("����� ����� ����");
				flag = true;
			}
		}
		return flag;
	}

}
