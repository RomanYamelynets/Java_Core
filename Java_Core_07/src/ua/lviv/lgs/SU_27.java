package ua.lviv.lgs;
import java.util.Random;

public class SU_27 extends Plane implements TurboAcceleration, StealthTechnology, NuclearStrike {
	private int maxSpeed;
	private String color;
	private Aircraft_control aircraft_control = new Aircraft_control();
	
	Random rand = new Random();
	
	public void moveUp() {
		aircraft_control.up();
	}
	
	public void moveDown() {
		aircraft_control.down();
	}
	
	public void moveRight() {
		aircraft_control.right();
	}
	
	public void moveLeft() {
		aircraft_control.left();
	}
	
	
	public SU_27(int length, int width, int weight, int maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	

	@Override
	public String toString() {
		return "SU_27 [maxSpeed=" + maxSpeed + ", color=" + color + ", " + super.toString() + "]";
	}


	@Override
	public void nuclearstrike() {
		System.out.println("Буде скинуто " + rand.nextInt(10) +" ядерних боєголовок");
		
	}

	@Override
	public void stealthtechnology() {
		System.out.println("Літака не видно протягом " + rand.nextInt(10) +  " хв");
		
	}

	@Override
	public void turboacceleration() {
		int randint = maxSpeed + rand.nextInt(500);
		System.out.println("Турбо Прискорення на " + randint + " км/год");
		
	}

}
