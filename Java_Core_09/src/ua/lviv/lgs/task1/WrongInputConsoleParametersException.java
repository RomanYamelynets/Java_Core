package ua.lviv.lgs.task1;

public class WrongInputConsoleParametersException extends Exception {

	private String description;

	public WrongInputConsoleParametersException(String description) {
		super(description);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
