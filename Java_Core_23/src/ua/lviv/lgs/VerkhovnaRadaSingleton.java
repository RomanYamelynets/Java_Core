package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

		faction.removeIf(i -> i.getName().equals(f));
	}

	void allFactions() {
		faction.stream().forEach((p) -> System.out.println(p));
	}

	void printFaction() {
		System.out.println("Enter Faction: ");
		Scanner scan = new Scanner(System.in);
		String fact = scan.next().toUpperCase();

		faction.stream().filter((p) -> p.getName().equals(fact)).forEach((p) -> System.out.println(p));
	}

	void addDeputyFaction() {
		System.out.println("Enter name Faction: ");
		Scanner scan = new Scanner(System.in);
		String fact = scan.next().toUpperCase();

		faction.stream().filter((f) -> f.getName().equals(fact)).forEach((f) -> f.addDeputy());
	}

	void deleteDeputyFaction() {
		System.out.println("Enter name Faction: ");
		Scanner scan = new Scanner(System.in);
		String fact = scan.next().toUpperCase();

		faction.stream().filter((f) -> f.getName().equals(fact)).forEach((f) -> f.deleteDeputy());

	}

	void allBriberFaction() {
		faction.stream().forEach((p) -> p.trueAndFolseBriber());

	}

	void allMaxBriberFaction() {
		faction.stream().forEach((p) -> p.maxBriber());
	}

	void allDeputyFaction() {
		faction.stream().forEach((p) -> p.allDeputy());
	}

	void removeAllDeputyFaction() {
		System.out.println("Enter name Faction: ");
		Scanner scan = new Scanner(System.in);
		String fact = scan.next().toUpperCase();

		boolean flag = false;

		for (Faction faction2 : faction) {
			if (faction2.getName().equals(fact)) {
				faction2.removeAllDeputies();
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("There is no such faction");
		}
	}

}
