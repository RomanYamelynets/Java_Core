package ua.lviv.lgs.task2;

import java.util.Arrays;
import java.util.Random;

public class Application {

	public static void main(String[] args) {

		Car[][] arrayOfCar = new Car[getRandomValueFromRange(0, 10)][getRandomValueFromRange(0, 10)];
		for (int i = 0; i < arrayOfCar.length; i++) {
			for (int j = 0; j < arrayOfCar[i].length; j++) {
				Wheel wheel = new Wheel(getRandomValueFromRange(37, 41), getRandomValueFromRange3());
				Engine engine = new Engine(getRandomValueFromRange2());
				Car c = new Car(getRandomValueFromRange(90, 500), getRandomValueFromRange(2000, 2022), wheel, engine);
				arrayOfCar[i][j] = c;
			}
		}
		System.out.println(Arrays.deepToString(arrayOfCar));
		
		Car[] arrayOfCar2 = new Car[getRandomValueFromRange(0, 10)];
		Wheel wheel2 = new Wheel(getRandomValueFromRange(37, 41), getRandomValueFromRange3());
		Engine engine2 = new Engine(getRandomValueFromRange2());
		Car c2 = new Car(getRandomValueFromRange(90, 500), getRandomValueFromRange(2000, 2022), wheel2, engine2);
		
		Arrays.fill(arrayOfCar2, c2);
		System.out.println("arrayOfCar2 = " + Arrays.deepToString(arrayOfCar2));

	}

	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}

	public static int getRandomValueFromRange2() {

		int cylinderArr[] = {2,3,4,5,6,8,10,12,16};
		
		int r = new Random().nextInt(cylinderArr.length);
		return cylinderArr[r];
	}
	
	public static String getRandomValueFromRange3() {

		String materialArr[] = {"Leather", "Alcantara"};
		
		int r = new Random().nextInt(materialArr.length);
		return materialArr[r];
	}

}
