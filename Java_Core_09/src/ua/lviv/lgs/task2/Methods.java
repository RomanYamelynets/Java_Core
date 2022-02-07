package ua.lviv.lgs.task2;

public class Methods {
	private int a;
	private int b;
	private int sum;

	public Methods(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	void Exception() throws IllegalAccessException, MyException {
		if ((a < 0) && (b < 0)) {
			throw new IllegalArgumentException();
		}
		if ((a == 0 & b != 0) || (a != 0 & b == 0)) {
			throw new ArithmeticException();
		}
		if ((a == 0) && (b == 0)) {
			throw new IllegalAccessException();
		}
		if ((a > 0) && (b > 0)) {
			throw new MyException("a>0 ³ b>0");
		}
	}

	void addition() throws IllegalAccessException, MyException {
		Exception();
		sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);

	}

	void subtraction() throws IllegalAccessException, MyException {
		Exception();
		sum = a - b;
		System.out.println(a + " - " + b + " = " + sum);
	}

	void multiplication() throws IllegalAccessException, MyException {
		Exception();
		sum = a * b;
		System.out.println(a + " * " + b + " = " + sum);
	}

	void division() throws IllegalAccessException, MyException {
		Exception();
		sum = a / b;
		System.out.println(a + " / " + b + " = " + sum);
	}
}
