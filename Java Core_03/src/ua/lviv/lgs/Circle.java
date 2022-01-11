package ua.lviv.lgs;

public class Circle {
	private double radius;
	private double diameter;
	
	Circle(double r, double d){
		this.radius = r;
		this.diameter = d;
	}
	
	public double calcArea() {
		double area = ( (Math.PI / 4) * diameter * diameter);
		return (area);
	}
	
	public double calcLength () {
		double l = (2 * Math.PI * radius);
		return (l);
	}

	@Override
	public String toString() {
		return "Площа кола = " + calcArea() + ", Довжина кола = " + calcLength();
	}
	
}
