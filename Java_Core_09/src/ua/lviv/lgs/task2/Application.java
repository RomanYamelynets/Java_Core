package ua.lviv.lgs.task2;


public class Application {
	public static void main(String[] args) throws IllegalAccessException, MyException {
		Methods m = new Methods(1, 2);
		m.addition();
		m.subtraction();
		m.multiplication();
		m.division();
	}
}
