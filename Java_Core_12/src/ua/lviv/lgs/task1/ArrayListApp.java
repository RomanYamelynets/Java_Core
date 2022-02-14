package ua.lviv.lgs.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListApp {

	public static void main(String[] args) {
		List<Car> car = new ArrayList<>();
		for (int i = 0; i < getRandomValueFromRange(3, 6); i++) {
			Wheel wheel = new Wheel(getRandomValueFromRange(37, 41), getRandomValueFromRange3());
			Engine engine = new Engine(getRandomValueFromRange2());
			Car c = new Car(getRandomValueFromRange(90, 500), getRandomValueFromRange(2000, 2022), wheel, engine);
			car.add(c);
		}
		System.out.println(car);
		System.out.println();

		List<Car> car2 = new ArrayList<>();
		Wheel wheel2 = new Wheel(getRandomValueFromRange(37, 41), getRandomValueFromRange3());
		Engine engine2 = new Engine(getRandomValueFromRange2());
		Car c2 = new Car(getRandomValueFromRange(90, 500), getRandomValueFromRange(2000, 2022), wheel2, engine2);
		for (int i = 0; i < 2; i++) {
			car2.add(c2);
		}
		System.out.println(car2);
	}

	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}

	public static int getRandomValueFromRange2() {

		int cylinderArr[] = { 2, 3, 4, 5, 6, 8, 10, 12, 16 };

		int r = new Random().nextInt(cylinderArr.length);
		return cylinderArr[r];
	}

	public static String getRandomValueFromRange3() {

		String materialArr[] = { "Leather", "Alcantara" };

		int r = new Random().nextInt(materialArr.length);
		return materialArr[r];
	}

}
