
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

		String num = readLine("Input: ");
		int intNum = stringToInt(num);
		println(intNum);
	}
	
	private int stringToInt(String s) {
		
		int k = 1;
		int ans = 0;
		for(int i=s.length()-1; i>=0; i--) {
			ans += (s.charAt(i) - '0') * k;
			k *= 10;
		}
		return ans;
	}

}
