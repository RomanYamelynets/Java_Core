package ua.lviv.lgs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static int menu() {
		System.out.println("1 - create a new cinema");
		System.out.println("2 - create/change cinema schedule");
		System.out.println("3 - delete cinema schedule");
		System.out.println("4 - display the cinema schedule");
		System.out.println("5 - create a hall");
		System.out.println("6 - delete hall");
		System.out.println("7 - display a list of hall");
		System.out.println("8 - create / change the schedule of the hall sessions");
		System.out.println("9 - delete the screening schedule of the cinema hall");
		System.out.println("10 - display the screening schedule of the cinema hall");
		System.out.println("11 - add a session to the schedule of cinema hall sessions for the day");
		System.out.println("12 - remove a session from the cinema hall schedule for the day");
		System.out.println("13 - add a movie to the cinema hall schedule");
		System.out.println("14 - remove a movie from the schedule of screenings of all cinema halls");
		System.out.println("0 - exit the program");
		System.out.println();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int menuChoise = scanner.nextInt();

		return menuChoise;
	}

	public static void main(String[] args)
			throws NumberFormatException, IllegalTimeFormatException, IOException, ClassNotFoundException {
		Cinema cinema = null;

		while (true) {
			switch (menu()) {

			case 1: {
				cinema = Cinema.inputCinema();
				break;
			}

			case 2: {
				cinema.addTimeTableToCinema();
				break;
			}

			case 3: {
				cinema.removeTimeTableFromCinema();
				break;
			}

			case 4: {
				cinema.viewCinemaTimeTable();
				break;
			}

			case 5: {
				cinema.addHallToCinema();
				break;
			}

			case 6: {
				cinema.removeHallFromCinema();
				break;
			}

			case 7: {
				cinema.viewCinemaHalls();
				break;
			}


			case 8: {
				cinema.viewHallTimeTableInCinema();
				break;
			}

			case 9: {
				cinema.addScheduleToHallInCinema();
				break;
			}

			case 10: {
				cinema.removeScheduleFromHallInCinema();
				break;
			}

			case 11: {
				cinema.viewHallScheduleInCinema();
				break;
			}

			case 12: {
				cinema.addSeanceToScheduleInHallInCinema();
				break;
			}

			case 13: {
				cinema.removeSeanceFromScheduleInHallInCinema();
				break;
			}
			
			case 14: {
				cinema.addMovieToSeanceInScheduleInHallInCinema();
				break;
			}

			case 15: {
				cinema.removeMovieFromSeanceInScheduleInAllHallsInCinema();
				break;
			}
			
			case 0: {
				System.out.println("Bye Bye\n");
				System.exit(0);
				break;
			}

			default: {
				System.err.println("error\n");
				break;
			}
			}
		}
	}
}