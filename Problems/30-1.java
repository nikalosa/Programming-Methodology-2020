
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
		while(n > 0) {
			n = printLastDigit(n);
		}
	}
	
	private int printLastDigit(int n) {
		print(n%10);
		return n/10;
	}
}
