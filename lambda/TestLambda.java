package org.lessons.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLambda {
	public static void main(String[] args) {
		List<Gift> regali = new ArrayList<>();
		
		regali.add(new Gift("Smartphone", 800));
		regali.add(new Gift("Buono Feltrinelli", 50));

		// Classe anonima che implementa Comparator
		Collections.sort(regali, new Comparator<Gift>() {
			@Override
			public int compare(Gift arg0, Gift arg1) {
				return Integer.compare(arg1.getPrezzo(), arg0.getPrezzo());
			}
		});
		
		// Lambda equivalente alla classe anonima
		Collections.sort(regali, (arg0, arg1) -> {
			return Integer.compare(arg1.getPrezzo(), arg0.getPrezzo());
		});
		
		regali.forEach(regalo -> {
			System.out.println(regalo.getNome() + " " + regalo.getPrezzo());
		});
		
	}
}
