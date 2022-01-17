package ua.lviv.lgs.task_2;

public class Person {
	String name;
	int age;
	int weight;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
}
