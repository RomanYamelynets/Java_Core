package ua.lviv.lgs.task1;

public class Wheel {
	private int wheelofDiameter;
	private String material;
	public Wheel(int wheelofDiameter, String material) {
		super();
		this.wheelofDiameter = wheelofDiameter;
		this.material = material;
	}
	public int getWheelofDiameter() {
		return wheelofDiameter;
	}
	public void setWheelofDiameter(int wheelofDiameter) {
		this.wheelofDiameter = wheelofDiameter;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Wheel [wheelofDiameter=" + wheelofDiameter + ", material=" + material + "]";
	}
	
	
}
