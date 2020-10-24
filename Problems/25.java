
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
		int m = readInt("m: ");
		
		int lcm = findLCM(n, m);
		println("LCM of " + n + " and " + m + " is: " + lcm);
	}
		
	private int findLCM(int n, int m) {
		int lcm = max(n, m);
		while(lcm % n != 0 || lcm % m != 0) {
			lcm += 1;
		}
		return lcm;
	}

	
	private int max(int n, int m) {
		if(n > m) {
			return n;
		}
		return m;
	}
	
}
