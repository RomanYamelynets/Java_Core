package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		Map<Integer, String> m = new Map<Integer, String>();
		Map<String, String> m2 = new Map<String, String>();
		m.add(1, "s1");
		m.add(2, "s2");
		m.add(3, "s3");
		m.add(4, "s4");
		m.deleteKey(1);
		m.deleteValue("s3");
		m.SetKey();
		m.ListValue();
		m.printMap();
	}
}
