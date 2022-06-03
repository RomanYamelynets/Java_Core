package ua.lviv.lgs.task2;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println("Enter 1 add product");
		System.out.println("Enter 2 delete the product");
		System.out.println("Enter 3 replace the product");
		System.out.println("Enter 4 sort by name");
		System.out.println("Enter 5 sort by length");
		System.out.println("Enter 6 sort by width");
		System.out.println("Enter 7 sort by weight");
		System.out.println("Enter 8 display the i-th element of the collection");
		System.out.println("Enter 9 Exit the program");
	}

	public static void main(String[] args) {
		CommodityList commodityList = new CommodityList();
		Scanner scan = new Scanner(System.in);

		while (true) {
			menu();
			switch (scan.next()) {
			case "1": {
				commodityList.addCommodity();
				break;
			}
			case "2": {
				commodityList.deleteCommodity();
				;
				break;
			}
			case "3": {
				commodityList.replaceCommodity();
				;
				break;
			}
			case "4": {
				commodityList.SortName();
				;
				break;
			}
			case "5": {
				commodityList.SortLength();
				;
				break;
			}
			case "6": {
				commodityList.SortWidth();
				;
				break;
			}
			case "7": {
				commodityList.SortWeight();
				;
				break;
			}
			case "8": {
				commodityList.indexCommodity();
				;
				break;
			}
			case "9": {
				commodityList.exit();
				;
				break;
			}
			}
		}

	}

}
