
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {
		
		int evenNumber = 0;
		while(true) {
			int n = readInt("N: ");	
			if(n == -1) {
				break;
			}
			if(n%2==0) {
				evenNumber ++;
			}
		}
		println("Number of even:" + evenNumber);
	}


}
