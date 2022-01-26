package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {
		SU_27 su27 = new SU_27(23, 34, 5000, 500, "black");
		System.out.println(su27);
		su27.StartingEngines();
		su27.AirplaneTakeoff();
		su27.moveUp();
		su27.moveLeft();
		su27.moveDown();
		su27.moveRight();
		su27.stealthtechnology();
		su27.nuclearstrike();
		su27.turboacceleration();
		su27.PlaneLanding();
	}

}
