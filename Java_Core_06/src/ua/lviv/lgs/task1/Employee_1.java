package ua.lviv.lgs.task1;

public class Employee_1 implements Salary {
	private String name;
	private int hour;
	
	
	
	public Employee_1(String name, int hour) {
		super();
		this.name = name;
		this.hour = hour;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getHour() {
		return hour;
	}



	public void setHour(int hour) {
		this.hour = hour;
	}
	



	@Override
	public void salary() {
		int salary = getHour() * 100;
		setHour(salary);
		System.out.println("Зарплата працівника з погодинною зарплатою становить " + salary + " гривень ");
	}
	
	

}
