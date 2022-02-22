package ua.lviv.lgs;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println("Enter 1 Add a club member");
		System.out.println("Enter 2 Add a pet to a club member");
		System.out.println("Enter 3 Remove the pet from the club member");
		System.out.println("Enter 4 Remove a member from the club");
		System.out.println("Enter 5 Remove a specific animal");
		System.out.println("Enter 6 Show on screen");
		System.out.println("Enter 7 Exit");
	}

	public static void main(String[] args) {
		ZooClub zc = new ZooClub();

		Scanner scan = new Scanner(System.in);
		while (true) {
			menu();
			switch (scan.next()) {
			case "1": {
				zc.addPerson();
				break;
			}
			case "2": {
				zc.addAnimal();
				break;
			}
			case "3": {
				zc.deleteAnimal();
				break;
			}
			case "4": {
				zc.deletePerson();
				break;
			}
			case "5": {
				zc.deleteTypeAnimal();
				break;
			}
			case "6": {
				zc.showZooClub();
				break;
			}
			case "7": {
				zc.exit();
				break;
			}
			}
		}
	}
}
