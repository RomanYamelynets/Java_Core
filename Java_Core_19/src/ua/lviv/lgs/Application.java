package ua.lviv.lgs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Application {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("serializeEmploee.txt");
		Employee emploee = new Employee(1, "Roman", 20000);
		System.out.println(emploee);

		Methods.serialize(emploee, file);

		System.out.println(Methods.deserealize(file));

		ArrayList<Employee> EmployeeList = new ArrayList<Employee>();

		File file2 = new File("serializeEmploee2.txt");

		EmployeeList.add(new Employee(1, "Roman", 20000));
		EmployeeList.add(new Employee(2, "Yaryna", 15000));
		EmployeeList.add(new Employee(3, "Maksym", 21000));
		EmployeeList.add(new Employee(4, "Ruslan", 40000));

		System.out.println(EmployeeList);

		Methods.serialize(EmployeeList, file2);

		System.out.println(Methods.deserealize(file2));
	}
}
