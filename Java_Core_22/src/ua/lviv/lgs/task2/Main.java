package ua.lviv.lgs.task2;


public class Main {

	static String changeStr(StringFunc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		String outStr;
		outStr = changeStr(Frog::eat, "eat");
		outStr = changeStr(Frog::sleep, "sleep");
		outStr = changeStr(Frog::swim, "swim");
		outStr = changeStr(Frog::walk, "walk");
		System.out.println(outStr);
	}

}