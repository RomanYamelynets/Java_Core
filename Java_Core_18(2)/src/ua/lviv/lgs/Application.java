package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		Map<String, Integer> newMap1 = new Map<>("1", 1);

		newMap1.addNewEntry("2", 2);
		newMap1.addNewEntry("3", 3);
		newMap1.viewMap();
		newMap1.removeEntry("1");
		newMap1.viewMap();
		newMap1.removeValue("2");
		newMap1.viewKeysSet();
		newMap1.viewValuesList();
		newMap1.viewMap();
	}
}
