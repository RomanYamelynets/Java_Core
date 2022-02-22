package ua.lviv.lgs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class CarClasss = Car.class;

		String s = CarClasss.getName();
		System.out.println(s);

		String simpleName = CarClasss.getSimpleName();
		System.out.println(simpleName);

		int mods = CarClasss.getModifiers();
		String modsText = Modifier.toString(mods);
		System.out.println("Class modifier = " + modsText + " int = " + mods);

		System.out.println(Modifier.isAbstract(mods));
		System.out.println(Modifier.isPublic(mods));

		Package package1 = CarClasss.getPackage();
		System.out.println(package1);

		Class superclass = CarClasss.getSuperclass();
		System.out.println(superclass);

		Constructor<Car>[] carConstructor = CarClasss.getConstructors();

		for (int i = 0; i < carConstructor.length; i++) {
			Constructor<Car> constructor = carConstructor[i];
			System.out.println(constructor);
		}

		System.out.println(carConstructor.length);

		Constructor<Car> constructor = carConstructor[1];

		Class<?>[] parameterTypes = constructor.getParameterTypes();

		for (int i = 0; i < parameterTypes.length; i++) {
			Class<?> class1 = parameterTypes[i];
			System.out.println(class1);
		}

		Constructor<Car> constructor2 = CarClasss.getConstructor(String.class, String.class, int.class);
		System.out.println(constructor2);
		Car newInstance = constructor2.newInstance("BMW", "X5", 2009);
		System.out.println(newInstance);
		System.out.println();

		Field[] fields = CarClasss.getFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field);
		}
		System.out.println();
		Field[] fields2 = CarClasss.getDeclaredFields();

		for (int i = 0; i < fields2.length; i++) {
			Field field = fields2[i];
			System.out.println(field);
		}
		
		//field set
		
		Field modelField = CarClasss.getField("model");
		modelField.set(newInstance, "x6");
		System.out.println(newInstance);
		
		Method[] methods = CarClasss.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println(method);
		}
		
		
	}

}
