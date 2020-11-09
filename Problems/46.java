
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
		
		println(maxFrequencyChar(s));
	}
	
		
	private char maxFrequencyChar(String s) {
		int maxCount = 0;
		char maxCountChar = 'a';
		for(char c = ' '; c <= '~'; c++) {
			int count = countChar(s, c);
			if(count >= maxCount) {
				maxCount = count;
				maxCountChar = c;			
			}
		}
		return maxCountChar;
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
