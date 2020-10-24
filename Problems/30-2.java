
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
		int reversedN = 0;
			
		for (int i = n; i > 0; i /= 10) {
			int lastDigit = i % 10;
			reversedN = reversedN * 10 + lastDigit; 
		}

		println(reversedN/2);
//		while (n > 0) {
//			print(n % 10);
//			n /= 10;
//		}
	}

}

//n = 123
//reversedN = 321
//
//reversedN = 0   n = 123  
//reversedN = 3  n = 12
//reversedN = 3*10 + 2 = 32  n = 1
//reversedN = 32 * 10 + 1 = 321 n = 0
