package ua.lviv.lgs;

public class Rectangle {
	private int length;
	private int width;
	
	Rectangle(){
		this.length = 8;
		this.width = 4;
	}
	
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	public int calcArea() {
		int area = length*width;
		return (area);
	}
	public int calcPerimeter() {
		int P = 2 * (length + width);
		return (P);
	}



	@Override
	public String toString() {
		return "Площа прямокутника = " + calcArea() + ", Периметр прямокутника = " + calcPerimeter();
	}


	
}
