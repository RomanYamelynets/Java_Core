package ua.lviv.lgs;

public class Car {
	@CarAnnotations(params = "Car - HP")
	private int HP;
	@CarAnnotations(params = "Year of manufacture of the car")
	private int yearOfManufacture;
	@CarAnnotations(params = "specify the car manufacturer")
	private String make;
	@CarAnnotations(params = "specify the car model")
	private String model;

	public Car(int hP, int yearOfManufacture, String make, String model) {
		super();
		HP = hP;
		this.yearOfManufacture = yearOfManufacture;
		this.make = make;
		this.model = model;
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

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [HP=" + HP + ", yearOfManufacture=" + yearOfManufacture + ", make=" + make + ", model=" + model
				+ "]";
	}

}
