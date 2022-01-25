package ua.lviv.lgs.task2_1;

import ua.lviv.lgs.task2.Numerable;

public class MyCalculator implements Numerable  {
	private double a;
	private double b;
	
	public double getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public MyCalculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void add() {
		double sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);
	}

	@Override
	public void subtract() {
		double sum = a - b;
		System.out.println(a + " - " + b + " = " + sum);
		
	}

	@Override
	public void multiply() {
		double sum = a * b;
		System.out.println(a + " * " + b + " = " + sum);
		
	}

	@Override
	public void devide() {
		double sum = a / b;
		System.out.println(a + " / " + b + " = " + sum);
		
	}


	
}
