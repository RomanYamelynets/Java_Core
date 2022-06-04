package ua.lviv.lgs.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void addToList(List list) {
		list.add("Hello");
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		addToList(list);
		System.out.println(list.get(0));
	}

}
