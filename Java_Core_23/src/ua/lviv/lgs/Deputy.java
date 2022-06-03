package ua.lviv.lgs;

import java.util.Scanner;

public class Deputy extends Person {

	private String surname;
	private String name;
	private int age;
	private boolean briber;
	private int bribe;

	public Deputy(int weight, int height, String surname, String name, int age, boolean briber) {
		super(weight, height);
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.briber = briber;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBriber() {
		return briber;
	}

	public void setBriber(boolean briber) {
		this.briber = briber;
	}

	public int getBribe() {
		return bribe;
	}

	public void setBribe(int bribe) {
		this.bribe = bribe;
	}

	

	

	@Override
	public String toString() {
		return "Deputy [surname=" + surname + ", name=" + name + ", Weight = " + getWeight() + ", Height = " + getHeight() + ", age=" + age + ", briber=" + briber + ", bribe="
				+ bribe + "]";
	}
	

	void GiveABribe() {
		if (!briber) {
			System.out.println("This deputy does not take bribes");
		}
		if (briber) {
			System.out.println("Enter the amount of the bribe : " + surname + " " + name);
			Scanner scan = new Scanner(System.in);
			int br = scan.nextInt();
			if (br > 5000) {
				System.out.println("The police will imprison the deputy - " + surname + " " + name);
			} else {
				this.bribe = br;
			}
		}
	}

}
