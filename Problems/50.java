
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
		
		StringTokenizer tokenizer = new StringTokenizer(s, " ,.!?:;");
		
		int wordCounter = 0;
		
		while(tokenizer.hasMoreTokens()) {
			println("Next token: " + tokenizer.nextToken());
			wordCounter ++;
		}
		
		// wordCounter = tokenizer.countTokens();
		
		println("Total words in the sentence: " + wordCounter);
		
		
		
	}

}

