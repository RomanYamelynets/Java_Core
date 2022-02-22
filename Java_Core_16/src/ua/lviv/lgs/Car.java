package ua.lviv.lgs;

import java.util.Objects;

public class Car {
	public String make;
	public String model;
	private int yearOfManufacture;

	public Car() {
		super();
	}

	public Car(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}

	public Car(String make, String model, int yearOfManufacture) {
		super();
		this.make = make;
		this.model = model;
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

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", yearOfManufacture=" + yearOfManufacture + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(make, model, yearOfManufacture);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(make, other.make) && Objects.equals(model, other.model)
				&& yearOfManufacture == other.yearOfManufacture;
	}

}
