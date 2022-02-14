package ua.lviv.lgs.task2;

public class Month {
	private String name;
	private int day;
	Seasons season;

	public Month(String name, int day, Seasons season) {
		super();
		this.name = name;
		this.day = day;
		this.season = season;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public Seasons getSeasons() {
		return season;
	}

	public void setSeason(Seasons season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "Month [name=" + name + ", day=" + day + ", season=" + season + "]";
	}

}
