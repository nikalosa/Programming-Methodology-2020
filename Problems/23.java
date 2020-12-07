import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		int n = readInt("n: ");
		int answer = sumN(n); //sumFormula(n);

		println("Sum from 1 to " + n + " is: " + answer);

	}

	private int sumN(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	private int sumFormula(int n) {
		return n*(n+1)/2;
	}

}

