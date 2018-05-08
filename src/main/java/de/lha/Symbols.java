package de.lha;

public enum Symbols {
	SCISSOR, ROCK, PAPER;
	
	/**
	 * Compares two symbols
	 * @param other the other symbol
	 * @return the returned value follows the same rules as the return of {@link java.util.Comparator#compare(T, T)} with this being the first and other being the second parameter
	 */
	public int compare(Symbols other) {
		switch (this) {
			case SCISSOR:
				switch (other) {
					case SCISSOR:
						return 0;
					case ROCK:
						return 1;
					case PAPER:
						return -1;
				}
			case ROCK:
				switch (other) {
					case SCISSOR:
						return -1;
					case ROCK:
						return 0;
					case PAPER:
						return 1;
				}
			case PAPER:
				switch (other) {
					case SCISSOR:
						return 1;
					case ROCK:
						return -1;
					case PAPER:
						return 0;
				}
		}
		return 0;
	}
}
