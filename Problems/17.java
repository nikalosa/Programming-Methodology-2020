
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {
		
		// &&  ||  !
		
		// &&  ->   T && T = T   T && F = F   F && T = F   F && F = F 
		// ||  ->   T || T = T   T || F = T   F || T = T   F || F = F
		// !   ->   !T = F       !F = T
		
		int a = readInt("a: ");
		int b = readInt("b: ");
		int c = readInt("c: ");
		
		if(a >= b && a >= c) {	
			println(a);
		}else if(b >= a && b >= c) {
			println(b);
		}else {
			println(c);
		}
		
		
	}

}