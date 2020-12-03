
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import java.util.ArrayList;
import java.util.LinkedList;

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		ArrayList<Integer> lst = new ArrayList<Integer>();

		while (true) {
			int numb = readInt("Next number: ");
			if (numb == -1) {
				break;
			}
			lst.add(numb);
		}

		printReverse(lst);

	}

	private void printReverse(ArrayList<Integer> lst) {
		for (int i = lst.size() - 1; i >= 0; i--) {
			println(lst.get(i));
		}
	}

}