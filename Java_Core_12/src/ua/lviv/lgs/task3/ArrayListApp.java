package ua.lviv.lgs.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayListApp {

	static void menu() {
		System.out.println("1. Add a new car");
		System.out.println("2. Delete by index");
		System.out.println("3. Delete by name");
		System.out.println("4. To show all collection");
	}

	public static void main(String[] args) {
		Car BMWX3 = new Car("BMW", "X3");
		Car BMWX5 = new Car("BMW", "X5");
		Car BMWX6 = new Car("BMW", "X6");
		Car Ford = new Car("FORD", "FOCUS");
		Car Toyota = new Car("Toyota", "Camry");

		List<Car> car = new ArrayList<>();
		car.add(BMWX3);
		car.add(BMWX5);
		car.add(BMWX6);
		car.add(Ford);
		car.add(Toyota);

		Scanner scan = new Scanner(System.in);

		while (true) {
			menu();
			switch (scan.next()) {
			case "1": {
				System.out.println("Enter make car and model : ");
				scan = new Scanner(System.in);
				String make = scan.next();
				System.out.println("Enter model car : ");
				scan = new Scanner(System.in);
				String model = scan.next();
				Car c = new Car(make, model);

				car.add(c);

				break;
			}
			case "2": {
				System.out.println("Enter index : ");
				scan = new Scanner(System.in);
				int index = scan.nextInt();
				car.remove(index);

				break;
			}
			case "3": {
				System.out.println("Enter model car : ");
				scan = new Scanner(System.in);
				String model = scan.next();

				for (int i = 0; i < car.size(); i++) {
					if (car.get(i).getModel().equalsIgnoreCase(model)) {
						car.remove(i);
					}
				}

				break;
			}
			case "4": {
				for (Car car2 : car) {
					System.out.println(car2);
				}
				break;
			}
			}
		}

	}

}
