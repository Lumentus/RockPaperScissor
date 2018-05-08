package de.lha;

public class SimulationResults {
	private int winsPlayerA;
	private int winsPlayerB;
	private int ties;
	
	public int getWinsPlayerA() {
		return winsPlayerA;
	}
	
	public int getWinsPlayerB() {
		return winsPlayerB;
	}
	
	public int getTies() {
		return ties;
	}
	
	public void increaseNumberOfWinsPlayerA() {
		winsPlayerA++;
	}
	
	public void increaseNumberOfWinsPlayerB() {
		winsPlayerB++;
	}
	
	public void increaseNumberOfTies() {
		ties++;
	}
}
