package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {
	private Map<Person, List<Animal>> map = new HashMap<>();

	void addPerson() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name person: ");
		String name = scan.next().toUpperCase();

		System.out.println("Enter age person: ");
		int age = scan.nextInt();

		Person person = new Person(name, age);
		map.put(person, new ArrayList<>());
		System.out.println("club member added");
	}

	void addAnimal() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter type animal: ");
		String typeAnimal = scan.next().toUpperCase();

		System.out.println("Enter name animal: ");
		String nameAnimal = scan.next().toUpperCase();

		System.out.println("Enter name person: ");
		String namePerson = scan.next().toUpperCase();

		Animal animal = new Animal(typeAnimal, nameAnimal);

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(namePerson)) {
				List<Animal> value = next.getValue();
				value.add(animal);
				next.setValue(value);
			}
		}
		System.out.println("animal added to club member");
	}

	void deleteAnimal() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter name animal: ");
		String nameAnimal = scan.next().toUpperCase();

		System.out.println("Enter name person: ");
		String namePerson = scan.next().toUpperCase();

		Iterator<Entry<Person, List<Animal>>> iterator2 = map.entrySet().iterator();
		while (iterator2.hasNext()) {
			Entry<Person, List<Animal>> next = iterator2.next();
			if (next.getKey().getName().equals(namePerson)) {
				List<Animal> valueAnimal = next.getValue();
				Iterator<Animal> iterator3 = valueAnimal.iterator();
				while (iterator3.hasNext()) {
					Animal next2 = iterator3.next();
					if (next2.getNameAnimal().equals(nameAnimal)) {
						iterator3.remove();
					}
				}
			}
		}
		System.out.println("the club member's pet has been removed");
	}

	void deletePerson() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name person: ");
		String name = scan.next().toUpperCase();

		Iterator<Entry<Person, List<Animal>>> iterator4 = map.entrySet().iterator();
		while (iterator4.hasNext()) {
			Entry<Person, List<Animal>> next = iterator4.next();
			if (next.getKey().getName().equals(name)) {
				iterator4.remove();

			}
		}
		System.out.println("club member removed");
	}

	void deleteTypeAnimal() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter type animal: ");
		String typeAnimal = scan.next().toUpperCase();

		Iterator<Entry<Person, List<Animal>>> iterator5 = map.entrySet().iterator();
		while (iterator5.hasNext()) {
			Entry<Person, List<Animal>> next = iterator5.next();
			List<Animal> value = next.getValue();
			Iterator<Animal> iterator6 = value.iterator();
			while (iterator6.hasNext()) {
				Animal next2 = iterator6.next();
				if (next2.getTypeAnimal().equals(typeAnimal)) {
					iterator6.remove();
				}

			}

		}
		System.out.println("a specific animal has been removed");
	}

	void showZooClub() {
		for (Entry<Person, List<Animal>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " ----- " + entry.getValue());
		}
	}

	void exit() {
		System.exit(0);
	}

}
