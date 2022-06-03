package ua.lviv.lgs;

import java.util.Scanner;

public class Main {
	static void menu() {
		System.out.println("Enter 1 to add a faction");
		System.out.println("Enter 2 to delete a specific faction");
		System.out.println("Enter 3 to display all factions");
		System.out.println("Enter 4 to clear a specific faction");
		System.out.println("Enter 5 to display a specific faction");
		System.out.println("Enter 6 to add the MP to the faction");
		System.out.println("Enter 7 to remove the MP from the faction");
		System.out.println("Enter 8 to display the list of bribe-takers");
		System.out.println("Enter 9 to display the largest bribe-taker");
		System.out.println("Enter 10 all all deputies of the faction");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			menu();
			switch (scan.next()) {
			case "1": {
				VerkhovnaRadaSingleton.getInstance().addFaction();
				break;
			}
			case "2": {
				VerkhovnaRadaSingleton.getInstance().deleteFaction();
				break;
			}
			case "3": {
				VerkhovnaRadaSingleton.getInstance().allFactions();
				break;
			}
			case "4": {
				VerkhovnaRadaSingleton.getInstance().removeAllDeputyFaction();
				break;
			}
			case "5": {
				VerkhovnaRadaSingleton.getInstance().printFaction();
				break;
			}
			case "6": {
				VerkhovnaRadaSingleton.getInstance().addDeputyFaction();
				break;
			}
			case "7": {
				VerkhovnaRadaSingleton.getInstance().deleteDeputyFaction();
				break;
			}
			case "8": {
				VerkhovnaRadaSingleton.getInstance().allBriberFaction();
				break;
			}
			case "9": {
				VerkhovnaRadaSingleton.getInstance().allMaxBriberFaction();
				break;
			}
			case "10": {
				VerkhovnaRadaSingleton.getInstance().allDeputyFaction();
				break;
			}
			}

		}

	}

}
