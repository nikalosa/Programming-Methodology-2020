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
			
			if (!hasChar(removedDuplicate, c)) {
				removedDuplicate += c;
			}
		}
		return removedDuplicate;
	}

	private boolean hasChar(String s, char c) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				return true;
			}
		}
		return false;
	}
}

