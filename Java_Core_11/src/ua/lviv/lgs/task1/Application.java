package ua.lviv.lgs.task1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {
	public static void main(String[] args) {
		Integer [] arrayOfIntegers = new Integer [10];
		for (int i = 0; i < arrayOfIntegers.length; i++) {
			arrayOfIntegers[i] = getRandomValueFromRange(10, 100);
		}
		
		System.out.println(Arrays.toString(arrayOfIntegers));
		System.out.println("After sorting asc");
		Arrays.sort(arrayOfIntegers);
		System.out.println(Arrays.toString(arrayOfIntegers));
		System.out.println("After sorting desc");
		Arrays.sort(arrayOfIntegers, Collections.reverseOrder());
		System.out.println(Arrays.toString(arrayOfIntegers));
	}
	
	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}
