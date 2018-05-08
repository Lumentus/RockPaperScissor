package de.lha;

import org.junit.Assert;
import org.junit.Test;

public class RockPaperScissorSimulationTest {

	@Test
	public void testCorrectCoutingUsingScissor() {
		Symbols ownSymbol = Symbols.SCISSOR;
		Assert.assertEquals("Scissor should beat paper", 1, 
				RockPaperScissorSimulation.simulateNumberOfGames(1, () -> ownSymbol, () -> Symbols.PAPER).getWinsPlayerA());
		Assert.assertEquals("Scissor should loose to rock", 1, 
				RockPaperScissorSimulation.simulateNumberOfGames(1, () -> ownSymbol, () -> Symbols.ROCK).getWinsPlayerB());
		Assert.assertEquals("Scissor should tie with scissor", 1, 
				RockPaperScissorSimulation.simulateNumberOfGames(1, () -> ownSymbol, () -> Symbols.SCISSOR).getTies());
	}
	
	@Test
	public void testCorrectCoutingUsingPaper() {
		Symbols ownSymbol = Symbols.PAPER;
		Assert.assertEquals("Paper should beat rock", 1, //
				RockPaperScissorSimulation.simulateNumberOfGames(1, () -> ownSymbol, () -> Symbols.ROCK).getWinsPlayerA());
		Assert.assertEquals("Paper should loose to scissor", 1, //
				RockPaperScissorSimulation.simulateNumberOfGames(1, () -> ownSymbol, () -> Symbols.SCISSOR).getWinsPlayerB());
		Assert.assertEquals("Paper should tie with paper", 1, //
				RockPaperScissorSimulation.simulateNumberOfGames(1, () -> ownSymbol, () -> Symbols.PAPER).getTies());
	}
	
	@Test
	public void testCorrectCoutingUsingRock() {
		Symbols ownSymbol = Symbols.ROCK;
		Assert.assertEquals("Rock should beat scissor", 1, 
				RockPaperScissorSimulation.simulateNumberOfGames(1, () -> ownSymbol, () -> Symbols.SCISSOR).getWinsPlayerA());
		Assert.assertEquals("Rock should loose to paper", 1, 
				RockPaperScissorSimulation.simulateNumberOfGames(1, () -> ownSymbol, () -> Symbols.PAPER).getWinsPlayerB());
		Assert.assertEquals("Rock should tie with rock", 1, 
				RockPaperScissorSimulation.simulateNumberOfGames(1, () -> ownSymbol, () -> Symbols.ROCK).getTies());
	}

}
