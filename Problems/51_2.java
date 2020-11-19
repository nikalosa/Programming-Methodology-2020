
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;
import java.util.StringTokenizer;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		String s = readLine("Input: ");

		String removedDuplicates = removeDuplicates(s);

		println(removedDuplicates);

	}

	private String removeDuplicates(String s) {
		String removedDuplicate = new String("");
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			
			if (removedDuplicate.indexOf(c) == -1) {
				removedDuplicate += c;
			}
		}
		return removedDuplicate;
	}
	
}
