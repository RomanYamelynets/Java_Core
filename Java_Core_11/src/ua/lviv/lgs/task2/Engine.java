package ua.lviv.lgs.task2;

public class Engine {
	private int cylinder;

	public Engine(int cylinder) {
		super();
		this.cylinder = cylinder;
	}

	public int getCylinder() {
		return cylinder;
	}

	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}

	@Override
	public String toString() {
		return "Engine [cylinder=" + cylinder + "]";
	}
	
	
}
