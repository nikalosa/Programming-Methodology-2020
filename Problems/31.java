
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
		if (isPrime(n)) {
			print("Prime");
		} else {
			print("Not Prime");
		}
	}

	private boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}

//n = 123
//reversedN = 321
//
//reversedN = 0   n = 123  
//reversedN = 3  n = 12
//reversedN = 3*10 + 2 = 32  n = 1
//reversedN = 32 * 10 + 1 = 321 n = 0
