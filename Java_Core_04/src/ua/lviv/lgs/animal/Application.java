package ua.lviv.lgs.animal;

public class Application {

	public static void main(String[] args) {
		Animal animal = new Animal("�������", 20, 7);
		String anName = animal.getName();
		int anSpeed = animal.getSpeed();
		int anAge = animal.getAge();
		
		System.out.println("����� ������� = " + animal.getName() + ", �������� ������� = " + animal.getSpeed() + " ��/���" + ", ³� ������� = " + animal.getAge() + " ����");
		
		animal.setName("���");
		animal.setSpeed(2);
		animal.setAge(14);
		System.out.println(animal);
	}

}
