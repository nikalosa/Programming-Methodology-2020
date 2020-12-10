
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		while (true) {
			String s = readLine();

			if (s.equals("")) {
				break;
			}

			StringTokenizer tokenizer = new StringTokenizer(s, " ");
			String A = tokenizer.nextToken();

			if (!tokenizer.hasMoreTokens()) {
				println("Invalid input. Enter again:");
				continue;
			}
			String B = tokenizer.nextToken();

			updateHm(hm, B, A);

		}

		printFriends(hm);
	}

	private void printFriends(HashMap<String, ArrayList<String>> hm) {

		for (String key : hm.keySet()) {
			print(key + ": ");
			ArrayList<String> val = hm.get(key);
			for (String friend : val) {
				print(friend + ", ");
			}
			println();
		}
	}

	private void updateHm(HashMap<String, ArrayList<String>> hm, String B, String A) {
		if (!hm.containsKey(B)) {
			hm.put(B, new ArrayList<String>());
		}
		ArrayList<String> friends = hm.get(B);
		friends.add(A);
	}

}
