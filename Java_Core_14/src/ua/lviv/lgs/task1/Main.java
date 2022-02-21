package ua.lviv.lgs.task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Car bmw = new Car("bmw", 25000);
		Car mercedes = new Car("mercedes", 30000);
		Car audi = new Car("audi", 20000);
		Car audi2 = new Car("audi", 21000);
		Car volkswagen = new Car("volkswagen", 15000);
		Car ford = new Car("ford", 10000);
		Car ford2 = new Car("ford", 10000);
		Car audi3 = new Car("audi", 19999);
		
		Set<Car> setCar = new HashSet<>();
		setCar.add(bmw);
		setCar.add(mercedes);
		setCar.add(audi);
		setCar.add(audi2);
		setCar.add(audi3);
		setCar.add(volkswagen);
		setCar.add(ford);
		setCar.add(ford2);

		for (Car car : setCar) {
			System.out.println(car);
		}
		

		TreeSet<Car> treesetCar = new TreeSet<>(new CarAllComparator());
		treesetCar.add(bmw);
		treesetCar.add(mercedes);
		treesetCar.add(audi);
		treesetCar.add(audi2);
		treesetCar.add(audi3);
		treesetCar.add(volkswagen);
		treesetCar.add(ford);
		treesetCar.add(ford2);

		System.out.println();
		for (Car car : treesetCar) {
			System.out.println(car);
		}

	}

}
