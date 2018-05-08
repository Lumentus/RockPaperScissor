package de.lha.players;

import org.junit.Assert;
import org.junit.Test;

import de.lha.Symbols;

public class PlayerATest {
	
	@Test
	public void testExpectedSymbols() {
		PlayerA player = new PlayerA();
		Assert.assertEquals("Player A should always use paper", Symbols.PAPER, player.get());
	}
}
