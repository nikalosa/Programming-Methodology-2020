import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		int n = readInt("n: ");
		int answer = fib(n);
		println("n'th element of fibonacci is " + answer);

	}

	private int fib(int n) {
		if (n == 1) {
			return 1;
		}
		int prev1 = 1, prev2 = 0;
		for (int i = 2; i <= n; i++) {
			int current = prev1 + prev2;
			prev2 = prev1;
			prev1 = current;
		}
		return prev1;
	}
}


