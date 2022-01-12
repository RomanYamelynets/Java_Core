package ua.lviv.lgs.animal;

public class Application {

	public static void main(String[] args) {
		Animal animal = new Animal("Леопард", 20, 7);
		String anName = animal.getName();
		int anSpeed = animal.getSpeed();
		int anAge = animal.getAge();
		
		System.out.println("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed() + " км/год" + ", Вік тварини = " + animal.getAge() + " років");
		
		animal.setName("Бик");
		animal.setSpeed(2);
		animal.setAge(14);
		System.out.println(animal);
	}

}
