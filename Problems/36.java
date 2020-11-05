
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;
import acm.util.RandomGenerator;

public class ConsoleProgrammSample extends ConsoleProgram {

	private final static int NSIM = 1000000;
	private RandomGenerator rgen = new RandomGenerator().getInstance();

	public void run() {

		int sumOfTurns = 0;
		for(int i=0;i<NSIM;i++) {
			int turns = simulation();
			sumOfTurns += turns;
		}
		double averageTurns = (double) sumOfTurns / NSIM;
		println("Average number of turns for HEAD: " + averageTurns);
	}
	
	private int simulation() {
		int turns = 3;
		boolean last1 = rgen.nextBoolean();
		boolean last2 = rgen.nextBoolean();
		while(true) {
			boolean current = rgen.nextBoolean();
			if(check(current, last1, last2)) {
				break;
			}
			last2 = last1;
			last1 = current;
			turns ++;
		}
		return turns;
	}
	
	private boolean check(boolean current, boolean last1, boolean last2) {
		return last1 && last2 && current;
	}

}
 


