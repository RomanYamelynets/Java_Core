package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Faction {
	private String name;
	List<Deputy> deputy = new ArrayList<>();

	public Faction(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Faction [name=" + name + ", deputy=" + deputy + "]";
	}

	void addDeputy() {
		System.out.println("Enter surname ");
		Scanner scan = new Scanner(System.in);
		String surname = scan.next().toUpperCase();

		System.out.println("Enter name ");
		String name = scan.next().toUpperCase();

		System.out.println("An MP - a bribe-taker? ");
		boolean briber = scan.nextBoolean();

		Deputy dep = new Deputy(getRandomValueFromRange(70, 150), getRandomValueFromRange(150, 190), surname, name,
				getRandomValueFromRange(40, 60), briber);
		dep.GiveABribe();
		deputy.add(dep);

	}

	void deleteDeputy() {
		System.out.println("Enter surname ");
		Scanner scan = new Scanner(System.in);
		String surname = scan.next().toUpperCase();

		System.out.println("Enter name ");
		String name = scan.next().toUpperCase();

		deputy.removeIf(i -> i.getSurname().equals(surname) & i.getName().equals(name));

	}

	void trueAndFolseBriber() {
		System.out.println();
		System.out.println("all bribe-takers Faction: " + this.name);

		deputy.stream().filter((p) -> p.isBriber())
				.forEach((p) -> System.out.println(p));

	}

	void maxBriber() {
		System.out.println();
		System.out.println("the biggest bribe-taker: ");

		Collections.sort(deputy, new DeputyBribeComparator());
		System.out.println(deputy.get(0));

	}

	void allDeputy() {
		System.out.println("Faction - " + this.name);
		deputy.stream().forEach((p) -> System.out.println(p));
	}

	void removeAllDeputies() {
		System.out.println("FRACTION CLEANED OF DEPUTIES ");

		ListIterator<Deputy> listIterator = deputy.listIterator();

		while (listIterator.hasNext()) {
			Deputy next = listIterator.next();
			listIterator.remove();

		}

		
	}
	


	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}

}
