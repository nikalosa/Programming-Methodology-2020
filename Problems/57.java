import java.util.LinkedList;

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	private final int SYMBOLS_NUM = 26;

	public void run() {

		String s1 = readLine("String #1: ");
		String s2 = readLine("String #2: ");

		boolean anagram = isAnagram(s1, s2);
		
		if(anagram) {
			println("Yooo they are anagrams");
		}else {
			println("Noooo thea are not anagrams");
		}

	}

	private boolean isAnagram(String s1, String s2) {
		int[] count1 = countSymbols(s1);
		int[] count2 = countSymbols(s2);

		return compare(count1, count2);
	}

	private boolean compare(int[] count1, int[] count2) {
		for (int i = 0; i < SYMBOLS_NUM; i++) {
			if (count1[i] != count2[i]) {
				return false;
			}
		}
		return true;
	}

	private int[] countSymbols(String s1) {

		int[] count = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			int ind = s1.charAt(i) - 'a';
			count[ind]++;
		}
		return count;
	}

}
