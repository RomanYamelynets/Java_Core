package ua.lviv.lgs;

import java.io.Serializable;
import java.util.Optional;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Map.Entry;

public class Cinema implements Serializable {

	private static final long serialVersionUID = -2991843421434092287L;
	private String name;
	private TimeTable cinemaTimeTable;
	private TreeSet<Hall> cinemaHalls;

	public Cinema(String name) {
		this.name = name;
		this.cinemaTimeTable = new TimeTable();
		this.cinemaHalls = new TreeSet<Hall>();
	}

	public String getName() {
		return name;
	}

	public static Cinema inputCinema() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the name of the cinema: ");
		String name = scanner.nextLine();
		if (name.equals("")) {
			System.err.println("The name of the cinema is entered incorrectly!");
			name = "-";
		}
		System.out.println("Cinema \"" + name.toString() + "\" successfully created\n");
		return new Cinema(name);
	}

	public void addHallToCinema() {
		Hall cinemaHall = Hall.inputHall();
		cinemaHalls.add(cinemaHall);
		System.out.println("Cinema hall \"" + cinemaHall.getName() + "\" successfully created \"" + name + "\"!\n");
	}

	public Optional<Hall> getHallFromSet(Hall cinemaHall) {
		Optional<Hall> hallFound = cinemaHalls.stream().filter(entry -> entry.getName().equals(cinemaHall.getName()))
				.findFirst();

		return hallFound;
	}

	public boolean removeHallFromCinema() {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			cinemaHalls.remove(hallFound.get());
			System.out.println(
					"Cinema hall \"" + hallFound.get().getName() + "\" removed \"" + name + "\"!\n");
			return true;
		} else {
			System.err.println("Cinema hall \"" + cinemaHall.getName() + "\" not found \"" + name + "\"!\n");
			return false;
		}
	}

	public boolean addTimeTableToCinema() throws IllegalTimeFormatException {
		boolean isDone = cinemaTimeTable.addTimeTableEntry();
		if (isDone) {
			System.out.println("Cinema opening hours \"" + name + "\" changed\n");
			return true;
		}else {
			System.err.println("Make changes to the cinema's opening hours \"" + name + "\" failed\n");
			return false;
		}
	}

	public boolean removeTimeTableFromCinema() {
		boolean isDone = cinemaTimeTable.removeTimeTableEntry();
		if (isDone) {
			System.out.println("Cinema opening hours \"" + name + "\" removed\n");
			return true;
		} else {
			System.err.println("Make changes to the cinema's opening hours \"" + name + "\" failed\n");
			return false;
		}
	}

	public boolean addTimeTableToHallInCinema() throws IllegalTimeFormatException {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			boolean isDone = hallFound.get().addTimeTableToHall();

			if (isDone) {
				System.out.println("Work schedule for \"" + hallFound.get() + "\" added to cinema \""
						+ name + "\"!\n");
				return true;
			} else {
				System.err.println("Make changes to the cinema's opening hours \"" + name + "\" failed\n");
				return false;
			}
		} else {
			System.err.println("Cinema hall \"" + cinemaHall.getName() + "\" not found \"" + name + "\"!\n");
			return false;
		}
	}

	public boolean removeTimeTableFromHallInCinema() {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			boolean isDone = hallFound.get().removeTimeTableFromHall();

			if (isDone) {
				System.out.println("Work schedule for \"" + hallFound.get() + "\" removed to cinema \""
						+ name + "\"!\n");
				return true;
			} else {
				System.err.println("Make changes to the cinema's opening hours \"" + name + "\" failed\n");
				return false;
			}
		} else {
			System.err.println("Cinema hall \"" + cinemaHall.getName() + "\" not found \"" + name + "\"!\n");
			return false;
		}
	}

	public boolean addScheduleToHallInCinema() throws IllegalTimeFormatException {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			boolean isDone = hallFound.get().addScheduleToHall();

			if (isDone) {
				System.out.println("Session schedule for \"" + hallFound.get() + "\" added in \""
						+ name + "\"!\n");
				return true;
			} else {
				System.err.println("Make changes to the session schedule for \"" + hallFound.get() + "\" cinema \""
						+ name + "\" failed\n");
				return false;
			}
		} else {
			System.err.println("Cinema hall \"" + cinemaHall.getName() + "\" not found \"" + name + "\"!\n");
			return false;
		}
	}

	public boolean removeScheduleFromHallInCinema() {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			boolean isDone = hallFound.get().removeScheduleFromHall();

			if (isDone) {
				System.out.println("Session schedule for \"" + hallFound.get() + "\" removed from cinema \""
						+ name + "\"!\n");
				return true;
			} else {
				System.err.println("Make changes to the session schedule for \"" + hallFound.get() + "\" cinema \""
						+ name + "\" failed\n");
				return false;
			}
		} else {
			System.err.println("Cinema hall \"" + cinemaHall.getName() + "\" not found \"" + name + "\"!\n");
			return false;
		}
	}

	public boolean addSeanceToScheduleInHallInCinema() throws IllegalTimeFormatException {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			Days day = Days.inputDay();
			if (day == null)
				return false;

			Optional<Entry<Days, Schedule>> hallScheduleEntryFound = hallFound.get().getHallSchedule().entrySet()
					.stream().filter(entry -> entry.getKey().equals(day)).findFirst();

			if (hallScheduleEntryFound.isPresent()) {
				Movie movie = Movie.inputMovie();
				boolean isDone = hallScheduleEntryFound.get().getValue().addSeance(movie);

				if (isDone)
					return true;
				else
					return false;
			} else {
				System.err.println(day.toLiteral(true) + " missing from the show schedule \"" + hallFound.get()
						+ "\" cinema \"" + name + "\"!\n");
				return false;
			}
		} else {
			System.err.println("Cinema hall \"" + cinemaHall.getName() + "\" not found \"" + name + "\"!\n");
			return false;
		}
	}

	public boolean removeSeanceFromScheduleInHallInCinema() throws IllegalTimeFormatException {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			Days day = Days.inputDay();
			if (day == null)
				return false;

			Optional<Entry<Days, Schedule>> hallScheduleEntryFound = hallFound.get().getHallSchedule().entrySet()
					.stream().filter(entry -> entry.getKey().equals(day)).findFirst();

			if (hallScheduleEntryFound.isPresent()) {
				Movie movie = Movie.inputMovie();
				Seance removingSeance = Seance.inputSeance(movie);
				boolean isDone = hallScheduleEntryFound.get().getValue().removeSeance(removingSeance);

				if (isDone)
					return true;
				else
					return false;
			} else {
				System.err.println(day.toLiteral(true) + " missing from the show schedule \"" + hallFound.get()
						+ "\" cinema \"" + name + "\"!\n");
				return false;
			}
		} else {
			System.err.println("Cinema hall \"" + cinemaHall.getName() + "\" not found \"" + name + "\"!\n");
			return false;
		}
	}

	public void addMovieToSeanceInScheduleInHallInCinema() throws IllegalTimeFormatException {
		Movie movie = Movie.inputMovie();

		boolean addOneMoreSeance;

		do {
			Hall cinemaHall = Hall.inputHall();

			Optional<Hall> hallFound = getHallFromSet(cinemaHall);

			if (hallFound.isPresent()) {
				Days day = Days.inputDay();
				if (day == null)
					return;

				Optional<Entry<Days, Schedule>> hallScheduleEntryFound = hallFound.get().getHallSchedule().entrySet()
						.stream().filter(entry -> entry.getKey().equals(day)).findFirst();

				if (hallScheduleEntryFound.isPresent()) {
					hallScheduleEntryFound.get().getValue().addSeance(movie);
				} else {
					System.err.println(day.toLiteral(true) + " missing from the show schedule \""
							+ hallFound.get() + "\" cinema \"" + name + "\"!\n");
				}
			} else {
				System.err
						.println("cinema hall \"" + cinemaHall.getName() + "\" not found \"" + name + "\"!\n");
			}

			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);

			System.out.print("Add another session? (true/false) ");
			addOneMoreSeance = scanner.nextBoolean();

			if (!addOneMoreSeance) {
				System.out.println("You have opted out of further adding sessions for this movie\n");
			}

		} while (addOneMoreSeance);
	}

	public void removeMovieFromSeanceInScheduleInAllHallsInCinema() throws IllegalTimeFormatException {
		Movie movie = Movie.inputMovie();
		boolean isDone = false;

		for (Hall hall : cinemaHalls) {
			for (Days day : Days.values()) {
				Optional<Seance> seance = hall.getHallSchedule().entrySet().stream()
						.filter(entry -> entry.getKey().equals(day)).findFirst().get().getValue()
						.getMovieSeanceFromSet(movie);

				if (seance.isPresent()) {
					hall.getHallSchedule().entrySet().stream().filter(entry -> entry.getKey().equals(day)).findFirst()
							.get().getValue().removeSeance(seance.get());
					isDone = true;
				} else
					break;
			}
		}

		if (isDone) {
			System.out.println(movie.toString() + " successfully removed from the schedule of screenings of all cinema halls\n");
		} else {
			System.err.println("Delete " + movie.toString()
					+ " from the schedule of sessions of all halls of the cinema failed, tk. This movie is not on the cinema's schedule.\n");
		}
	}

	public void viewCinemaTimeTable() {
		System.out.print("Cinema \"" + name + "\"\n");
		cinemaTimeTable.viewTimeTable();
		System.out.println();
	}

	public void viewCinemaHalls() {
		System.out.println("List of cinema halls \"" + name + "\":");
		cinemaHalls.forEach(System.out::println);
		System.out.println();
	}

	public boolean viewHallTimeTableInCinema() {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			hallFound.get().viewHallTimeTable();
			return true;
		} else {
			System.err.println("Cinema hall \"" + cinemaHall.getName() + "\" not found \"" + name + "\"!\n");
			return false;
		}
	}

	public boolean viewHallScheduleInCinema() {
		Hall cinemaHall = Hall.inputHall();

		Optional<Hall> hallFound = getHallFromSet(cinemaHall);

		if (hallFound.isPresent()) {
			hallFound.get().viewHallSchedule();
			return true;
		} else {
			System.err.println("Cinema hall \"" + cinemaHall.getName() + "\" not found \"" + name + "\"!\n");
			return false;
		}
	}

	@Override
	public String toString() {
		if (name == "Cinema") {
			return (String) name;
		} else
			return "Cinema \"" + name + "\"";
	}
}