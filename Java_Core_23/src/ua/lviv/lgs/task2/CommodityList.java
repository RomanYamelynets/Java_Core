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
		
		commodity.stream().forEach((p) -> System.out.println(p));
		

	}

	void deleteCommodity() {
		System.out.println("Enter name Commodity: ");
		Scanner scan = new Scanner(System.in);
		String n = scan.next().toUpperCase();
		
		commodity.removeIf(i -> i.getName().equals(n));
		commodity.stream().forEach((p) -> System.out.println(p));
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
		
		commodity.stream().forEach((p) -> System.out.println(p));

		if (!flag) {
			System.out.println("Such a product does not exist");
		}
	}

	void SortName() {
		Collections.sort(commodity, new SortNameCommodity());
		commodity.stream().forEach((p) -> System.out.println(p));
	}

	void SortLength() {
		Collections.sort(commodity, new SortLengthCommodity());
		commodity.stream().forEach((p) -> System.out.println(p));
	}

	void SortWidth() {
		Collections.sort(commodity, new SortWidthCommodity());
		commodity.stream().forEach((p) -> System.out.println(p));
	}

	void SortWeight() {
		Collections.sort(commodity, new SortWeightCommodity());
		commodity.stream().forEach((p) -> System.out.println(p));

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
