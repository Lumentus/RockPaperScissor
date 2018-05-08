package de.lha.players;

import java.util.Random;
import java.util.function.Supplier;

import de.lha.Symbols;

public class PlayerB implements Supplier<Symbols> {
	
	private static final Random rand = new Random();
	private static final Symbols[] symbols = Symbols.values();

	@Override
	public Symbols get() {
		return getVocabulary()[rand.nextInt(symbols.length)];
	}
	
	public Symbols[] getVocabulary() {
		return symbols;
	}

}
