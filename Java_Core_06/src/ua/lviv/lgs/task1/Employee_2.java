package ua.lviv.lgs.task1;

public class Employee_2 implements Salary {
	private String name;
	private int month;
	
	
	public Employee_2(String name, int month) {
		super();
		this.name = name;
		this.month = month;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public void salary() {
		int salary = getMonth()*15000;
		setMonth(salary);
		System.out.println("Фіксована місячна зарплата працівника становить " + salary + " гривень");
		
	}

}
