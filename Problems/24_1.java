
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		int n = readInt("n: ");
		int answer = numberOfDivisors(n);
		println("Number of divisors: " + answer);
	}

	private int numberOfDivisors(int n) {
		int divisorsNumb = 0;

		for (int i = 1; i <= n; i++) {
			if (isDivisor(n, i)) {
				divisorsNumb++;
			}
		}
		return divisorsNumb;
	}

	private boolean isDivisor(int n, int m) {
		return n % m == 0;
	}

}
