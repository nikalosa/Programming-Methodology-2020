import java.util.HashMap;

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		int n = readInt("N: ");
		int m = readInt("M: ");

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = readInt();
		}

		int answer = numberOfPairs(m, arr);

		println(answer);

	}

	private int numberOfPairs(int m, int[] arr) {

		int answer = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == m) {
					answer ++;
				}
			}
		}
		
		return answer;
	}

}