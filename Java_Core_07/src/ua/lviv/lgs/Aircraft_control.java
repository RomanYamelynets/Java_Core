package ua.lviv.lgs;
import java.util.Random;

public class Aircraft_control {
	Random rand = new Random();
	
	public void up() {
		System.out.println("˳��� �������� ����� �� " + rand.nextInt(50) +" ��");
	};
	void down() {
		System.out.println("˳��� �������� ���� �� " + rand.nextInt(50) +" ��");
	};
	void left() {
		System.out.println("˳��� �������� ���� �� " + rand.nextInt(50) +" ��");
	};
	void right() {
		System.out.println("˳��� �������� ������ �� " + rand.nextInt(50) +" ��");
	};
	
}
