package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class VerkhovnaRadaSingleton {
	private static VerkhovnaRadaSingleton instance;
	List<Faction> faction = new ArrayList<>();

	private VerkhovnaRadaSingleton() {
	}

	public static VerkhovnaRadaSingleton getInstance() {
		if (instance == null) {
			instance = new VerkhovnaRadaSingleton();
		}
		return instance;
	}

	void addFaction() {
		System.out.println("Enter Faction: ");
		Scanner scan = new Scanner(System.in);
		String f1 = scan.next().toUpperCase();

		Faction fact = new Faction(f1);
		faction.add(fact);
	}

	void deleteFaction() {
		System.out.println("Enter Faction: ");
		Scanner scan = new Scanner(System.in);
		String f = scan.next().toUpperCase();

		ListIterator<Faction> listIterator = faction.listIterator();

		while (listIterator.hasNext()) {
			Faction next = listIterator.next();

			if (next.getName().equals(f)) {
				listIterator.remove();
			}
		}
	}

	void allFactions() {
		for (Faction faction2 : faction) {
			System.out.println(faction2);
		}
	}

	void printFaction() {
		System.out.println("Enter Faction: ");
		Scanner scan = new Scanner(System.in);
		String fact = scan.next().toUpperCase();

		boolean flag = false;

		for (Faction faction2 : faction) {
			if (faction2.getName().equals(fact)) {
				System.out.println("Faction " + faction2);
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("There is no such faction");
		}
	}

	void addDeputyFaction() {
		System.out.println("Enter name Faction: ");
		Scanner scan = new Scanner(System.in);
		String fact = scan.next().toUpperCase();
		boolean flag = false;

		for (Faction faction2 : faction) {
			if (faction2.getName().equals(fact)) {
				faction2.addDeputy();
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("There is no such faction");
		}
	}

	void deleteDeputyFaction() {
		System.out.println("Enter name Faction: ");
		Scanner scan = new Scanner(System.in);
		String fact = scan.next().toUpperCase();

		boolean flag = false;

		for (Faction faction2 : faction) {
			if (faction2.getName().equals(fact)) {
				faction2.deleteDeputy();
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("There is no such faction");
		}
	}

	void allBriberFaction() {
		for (Faction faction2 : faction) {
			faction2.trueAndFolseBriber();
		}
	}

	void allMaxBriberFaction() {
		for (Faction faction2 : faction) {
			faction2.maxBriber();
		}
	}

	void allDeputyFaction() {
		for (Faction faction2 : faction) {
			faction2.allDeputy();
		}
	}
	
	void removeAllDeputyFaction() {
		System.out.println("Enter name Faction: ");
		Scanner scan = new Scanner(System.in);
		String fact = scan.next().toUpperCase();

		boolean flag = false;

		for (Faction faction2 : faction) {
			if (faction2.getName().equals(fact)) {
				faction2.removeAllDeputies();;
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("There is no such faction");
		}
	}

}
