package ua.lviv.lgs.task1;

public class Car {
	private int HP;
	private int yearOfManufacture;
	Wheel wheel;
	Engine engine;
	
	public Car(int hP, int yearOfManufacture, Wheel wheel, Engine engine) {
		super();
		HP = hP;
		this.yearOfManufacture = yearOfManufacture;
		this.wheel = wheel;
		this.engine = engine;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [HP=" + HP + ", yearOfManufacture=" + yearOfManufacture + ", wheel=" + wheel + ", engine=" + engine
				+ "]";
	}
	
	
	
	
}
