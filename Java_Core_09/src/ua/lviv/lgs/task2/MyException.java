package ua.lviv.lgs.task2;

public class MyException extends Exception {
	private String description;

	public MyException(String description) {
		super(description);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	
}
