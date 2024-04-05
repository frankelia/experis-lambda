package org.lessons.lambda;

import java.util.Comparator;

public class GiftComparatorAlfabetico implements Comparator<Gift> {

	@Override
	public int compare(Gift arg0, Gift arg1) {
		return arg0.getNome().compareTo(arg1.getNome());
	}

}
