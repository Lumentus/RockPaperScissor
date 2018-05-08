package de.lha;

import org.junit.Assert;
import org.junit.Test;

public class SymbolsTest {
	
	@Test
	public void testUsingScissor() {
		Symbols ownSymbol = Symbols.SCISSOR;
		Assert.assertEquals("Scissor should beat paper", -1, ownSymbol.compare(Symbols.PAPER));
		Assert.assertEquals("Scissor should loose to rock", 1, ownSymbol.compare(Symbols.ROCK));
		Assert.assertEquals("Scissor should be equal to scissor", 0, ownSymbol.compare(Symbols.SCISSOR));
	}
	
	@Test
	public void testUsingPaper() {
		Symbols ownSymbol = Symbols.PAPER;
		Assert.assertEquals("Paper should be equal to  paper", 0, ownSymbol.compare(Symbols.PAPER));
		Assert.assertEquals("Paper should beat rock", -1, ownSymbol.compare(Symbols.ROCK));
		Assert.assertEquals("Paper should loose to scissor", 1, ownSymbol.compare(Symbols.SCISSOR));
	}
	
	@Test
	public void testUsingRock() {
		Symbols ownSymbol = Symbols.ROCK;
		Assert.assertEquals("Rock should loose to paper", 1, ownSymbol.compare(Symbols.PAPER));
		Assert.assertEquals("Rock should be equal to rock", 0, ownSymbol.compare(Symbols.ROCK));
		Assert.assertEquals("Rock should beat scissor", -1, ownSymbol.compare(Symbols.SCISSOR));
	}
	
}
