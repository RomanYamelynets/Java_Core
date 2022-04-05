package ua.lviv.lgs;



public class Application {


	public static void main(String[] args) {

		Cow cow = new Cow();
		cow.execute(() -> System.out.println("I'm a cow"));
		
		Cat cat = new Cat();
		cat.execute(() -> System.out.println("I'm a cat"));
		
		Dog dog = new Dog();
		dog.execute(() -> System.out.println("I'm a dog"));
		}

}
