
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;
import acm.util.RandomGenerator;

public class ConsoleProgrammSample extends ConsoleProgram {

	private int n = 10000000;

	public void run() {

		int primeNumb = 0;
		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				primeNumb ++;
			}
		}
		print(primeNumb);
	}

	private boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
