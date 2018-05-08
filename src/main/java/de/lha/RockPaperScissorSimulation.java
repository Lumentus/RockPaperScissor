package de.lha;

import java.util.function.Supplier;

import de.lha.players.PlayerA;
import de.lha.players.PlayerB;

public class RockPaperScissorSimulation {
	
	/**
	 * Simulate numberOfGames between the players A and B
	 * @param numberOfGames the number of games to simulate
	 * @param playerA a {@link java.util.function.Supplier} that gives the used symbols by player a
	 * @param playerB a {@link java.util.function.Supplier} that gives the used symbols by player b
	 * @return the number of wins for player a, number of wins for player b and the number of ties contained in a {@link SimulationResults} object
	 */
	public static SimulationResults simulateNumberOfGames(int numberOfGames, Supplier<Symbols> playerA, Supplier<Symbols> playerB) {
		SimulationResults results = new SimulationResults();
		for (int i = 0; i < numberOfGames; i++) {
			int res = playerA.get().compare(playerB.get());
			if (res < 0) {
				results.increaseNumberOfWinsPlayerA();
			} else if (res > 0) {
				results.increaseNumberOfWinsPlayerB();
			} else {
				results.increaseNumberOfTies();
			}
		}
		return results;
	}

	public static void main(String[] args) {
		SimulationResults results = RockPaperScissorSimulation.simulateNumberOfGames(100, new PlayerA(), new PlayerB());
		System.out.println("Player A wins " + results.getWinsPlayerA() + " of 100 games");
		System.out.println();
		System.out.println("Player B wins " + results.getWinsPlayerB() + " of 100 games");
		System.out.println();
		System.out.println(results.getTies() + " of 100 games are ties");
	}

}
