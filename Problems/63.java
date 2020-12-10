
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

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

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

			updateHm(hm, B);

		}

		String maxFriends = getMax(hm);
		println(maxFriends + "has the most friends!!!");
	}

	private String getMax(HashMap<String, Integer> hm) {

		int maxFriendsNum = 0;
		String maxFriends = "";

		for (String key : hm.keySet()) {
			int val = hm.get(key);
			if (val > maxFriendsNum) {
				maxFriendsNum = val;
				maxFriends = key;
			}
		}
		return maxFriends;
	}

	private void updateHm(HashMap<String, Integer> hm, String B) {
		if (!hm.containsKey(B)) {
			hm.put(B, 1);
		} else {
			int val = hm.get(B);
			hm.replace(B, val + 1);
		}

	}

}
