package de.lha.players;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.Test;

import de.lha.Symbols;

public class PlayerBTest {

	@Test
	public void testPlayerBVocabulary() { // since player b is random this is really the only deterministic test that we can do
		PlayerB player = new PlayerB();
		List<Symbols> vocabulary = Arrays.asList(player.getVocabulary());
		assertThat("vocabulary should contain all symbols", vocabulary, IsIterableContainingInAnyOrder.containsInAnyOrder(Symbols.values()));
	}

}
