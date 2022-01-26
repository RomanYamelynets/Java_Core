package ua.lviv.lgs;
import java.util.Random;

public abstract class Plane {
	private int length;
	private int width;
	private int weight;
	
	Random rand = new Random();
	
	
	
	public Plane(int length, int width, int weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "length=" + length + ", width=" + width + ", weight=" + weight;
	}
	
	void StartingEngines() {
		System.out.println("Літак взлетить через " + (rand.nextInt(88) + 20) +" с");
	};
	void AirplaneTakeoff() {
		System.out.println("Літак взлітає, залишок палива на " + rand.nextInt(1000) + " км");
	};
	void PlaneLanding() {
		System.out.println("Літак іде на посадку");
	};
	
}
