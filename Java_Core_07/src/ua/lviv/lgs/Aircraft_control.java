package ua.lviv.lgs;
import java.util.Random;

public class Aircraft_control {
	Random rand = new Random();
	
	public void up() {
		System.out.println("Літак рухається вверх на " + rand.nextInt(50) +" км");
	};
	void down() {
		System.out.println("Літак рухається вниз на " + rand.nextInt(50) +" км");
	};
	void left() {
		System.out.println("Літак рухається вліво на " + rand.nextInt(50) +" км");
	};
	void right() {
		System.out.println("Літак рухається вправо на " + rand.nextInt(50) +" км");
	};
	
}
