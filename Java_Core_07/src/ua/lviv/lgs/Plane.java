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
		System.out.println("˳��� �������� ����� " + (rand.nextInt(88) + 20) +" �");
	};
	void AirplaneTakeoff() {
		System.out.println("˳��� �����, ������� ������ �� " + rand.nextInt(1000) + " ��");
	};
	void PlaneLanding() {
		System.out.println("˳��� ��� �� �������");
	};
	
}
