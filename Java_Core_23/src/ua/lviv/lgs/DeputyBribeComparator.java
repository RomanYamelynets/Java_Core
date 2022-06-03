package ua.lviv.lgs;

import java.util.Comparator;

public class DeputyBribeComparator implements Comparator<Deputy> {

	@Override
	public int compare(Deputy o1, Deputy o2) {
		return o1.getBribe() < o2.getBribe() ? 1 : -1;
	}

}
