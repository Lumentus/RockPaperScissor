package de.lha.players;

import java.util.function.Supplier;

import de.lha.Symbols;

public class PlayerA implements Supplier<Symbols> {

	@Override
	public Symbols get() {
		return Symbols.PAPER;
	}

}
