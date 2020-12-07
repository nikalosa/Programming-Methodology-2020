import acm.program.*;
import acm.util.RandomGenerator;


public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		String s = readLine("Input: ");
		
		charFrequencies(s);
	}
	
		
	private void charFrequencies(String s) {
		for(char c = ' '; c <= '~'; c++) {
			int count = countChar(s, c);
			if(count > 0) {
				println(c + ": " + count);
			}
		}
	}
	
	
	
	private int countChar(String input, char c) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}


}
