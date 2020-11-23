
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		int n = readInt();		
		if (isPalindrome(n)) {
			println("Yes");
		} else {
			println("No");
		}

	}

	private boolean isPalindrome(int n) {
		int rev = getReverse(n);
		return n == rev;
	}

	private int getReverse(int n) {
		int rev = 0;
		while (n > 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		return rev;
	}
}
