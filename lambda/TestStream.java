package org.lessons.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
	public static void main(String[] args) {
		List<Gift> regali = new ArrayList<>();
		
		regali.add(new Gift("Smartphone", 800));
		regali.add(new Gift("Buono Feltrinelli", 50));
		regali.add(new Gift("Buono Mondadori", 50));
		regali.add(new Gift("Flauto traverso", 80));
		regali.add(new Gift("Violino", 110));
		regali.add(new Gift("Pianoforte a coda", 10500));

		List<Gift> regaliFiltrati = new ArrayList<>();
		for (Gift g : regali) {
			if (g.getPrezzo() > 100) {
				regaliFiltrati.add(g);
			}
		}

		regaliFiltrati.forEach(r -> {
			System.out.println(r.getNome() + " " + r.getPrezzo());
		});
		System.out.println();
		
//		regali.stream().filter(new Predicate<Gift>() {
//			@Override
//			public boolean test(Gift arg0) {
//				return arg0.getPrezzo() > 100;
//			}
//		});
		
		
		
		List<Gift> regaliFiltratiConStream = regali.stream()
//			.filter(g -> g.getPrezzo() > 100)
			.sorted((a, b) -> Integer.compare(b.getPrezzo(), a.getPrezzo()))
			.limit(3)
			.collect(Collectors.toList());
		
		regaliFiltratiConStream.forEach(r -> {
			System.out.println(r.getNome() + " " + r.getPrezzo());
		});
		
		Integer sommaPrezzi = 
			regali.stream().map(regalo -> regalo.getPrezzo()).reduce(Integer::sum).orElse(0);
		
		boolean tuttiPrezziMaggiore0 = regali.stream().allMatch(r -> r.getPrezzo() > 0);
		boolean almenoUnoMaggiore1000 = regali.stream().anyMatch(r -> r.getPrezzo() > 1000);
		System.out.println(sommaPrezzi);
		
		
		
		int somma = regali.stream()
					.filter(g -> g.getPrezzo() > 60 && g.getNome().startsWith("B"))
					.map(g  -> g.getPrezzo())
					.reduce(Integer::sum)
					.orElse(-1);
					
					
		
	}
}
