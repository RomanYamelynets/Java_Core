package ua.lviv.lgs;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		getAnnotation(Car.class);

		
	}

	public static void getAnnotation(Class<?> customClass) throws IOException, ClassNotFoundException {
		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(CarAnnotations.class) instanceof CarAnnotations) {
				System.out.print(field.getName() + " ----- annotaion value =");
				
				File file = new File("serializeCar.txt");
				Methods.serialize(field.getAnnotation(CarAnnotations.class).params(), file);
				System.out.println(Methods.deserializa(file));
				
			}
		}

	}
}
