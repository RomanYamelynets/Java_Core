package ua.lviv.lgs.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CommodityList {
	private List<Commodity> commodity = new ArrayList<>();

	void addCommodity() {
		System.out.println("Enter name Commodity: ");
		Scanner scan = new Scanner(System.in);
		String n = scan.next().toUpperCase();

		System.out.println("Enter length Commodity: ");
		int l = scan.nextInt();

		System.out.println("Enter width Commodity: ");
		int wid = scan.nextInt();

		System.out.println("Enter weight Commodity: ");
		int weig = scan.nextInt();

		Commodity c = new Commodity(n, l, wid, weig);
		commodity.add(c);
		for (Commodity commodity2 : commodity) {
			System.out.println(commodity2);
		}

	}

	void deleteCommodity() {
		System.out.println("Enter name Commodity: ");
		Scanner scan = new Scanner(System.in);
		String n = scan.next().toUpperCase();

		Iterator<Commodity> iterator = commodity.iterator();

		while (iterator.hasNext()) {
			Commodity next = iterator.next();

			if (next.getName().equals(n)) {
				iterator.remove();
			}

		}

		for (Commodity commodity2 : commodity) {
			System.out.println(commodity2);
		}
	}

	void replaceCommodity() {
		System.out.println("Enter the name of the product you want to change: ");
		Scanner scan = new Scanner(System.in);
		String n = scan.next().toUpperCase();

		System.out.println("Enter a name for the new product: ");
		String nReplace = scan.next().toUpperCase();

		System.out.println("Enter a length for the new product: ");
		int lReplace = scan.nextInt();

		System.out.println("Enter a width for the new product: ");
		int widReplace = scan.nextInt();

		System.out.println("Enter a weight for the new product: ");
		int weigReplace = scan.nextInt();

		Commodity cReplace = new Commodity(nReplace, lReplace, widReplace, weigReplace);

		boolean flag = false;
		for (Commodity commodity2 : commodity) {
			if (commodity2.getName().equals(n)) {
				int indexCommodity = commodity.indexOf(commodity2);
				commodity.set(indexCommodity, cReplace);
				flag = true;
			}

		}
		for (Commodity commodity2 : commodity) {
			System.out.println(commodity2);
		}
		if (!flag) {
			System.out.println("Such a product does not exist");
		}
	}

	void SortName() {
		Collections.sort(commodity, new SortNameCommodity());
		
		for (Commodity commodity2 : commodity) {
			System.out.println(commodity2);
		}

	}

	void SortLength() {
		Collections.sort(commodity, new SortLengthCommodity());
		
		for (Commodity commodity2 : commodity) {
			System.out.println(commodity2);
		}

	}

	void SortWidth() {
		Collections.sort(commodity, new SortWidthCommodity());
		
		for (Commodity commodity2 : commodity) {
			System.out.println(commodity2);
		}

	}

	void SortWeight() {
		Collections.sort(commodity, new SortWeightCommodity());
		
		for (Commodity commodity2 : commodity) {
			System.out.println(commodity2);
		}

	}

	void indexCommodity() {
		System.out.println("Enter the index of the product: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		boolean flag = false;
		for (Commodity commodity2 : commodity) {
			if (commodity.indexOf(commodity2) == n) {
				System.out.println(commodity.get(n));
				flag = true;
			}

		}
		if (!flag) {
			System.out.println("Such a product does not exist");
		}
	}

	void exit() {
		System.exit(0);
	}

}
