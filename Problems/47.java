
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

		String s = readLine("Input: ");

		println(isPalindrome(s));
	}

	private boolean isPalindrome(String s) {

		String reversed = reverse(s);	
		return s.equals(reversed);
	}

	private String reverse(String s) {
		String reversed = new String("");
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		return reversed;
	}
}
