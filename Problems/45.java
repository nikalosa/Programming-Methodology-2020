
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;
import acm.util.RandomGenerator;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		String input = readLine("Input: ");
		String symLine = readLine("Char: ");

		char c = symLine.charAt(0);

		println(countChar(input, c));
	}

	private int countChar(String input, char c) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

}
