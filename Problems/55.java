import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		int n = readInt();

		boolean isSorted = true;
		int lastValue = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int nextValue = readInt();
			if (nextValue < lastValue) {
				isSorted = false;
			}
			lastValue = nextValue;
		}

		if (isSorted) {
			println("Sorted");
		} else {
			println("Not-Sorted");
		}

	}

}