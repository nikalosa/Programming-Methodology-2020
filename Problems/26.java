import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		int n = readInt("n: ");
		int m = readInt("m: ");

		int gcd = gcd(n, m);
		
		println("Greatest commond divisor of " + n + " and " + m + " is " + gcd);
	}

	private int gcd(int n, int m) {
		int minNum = min(n, m);
		for (int i = minNum; i >= 2; i--) {
			if (n % i == 0 && m % i == 0) {
				return i;
			}
		}
		return 1;
	}

	private int min(int n, int m) {
//		if(n < m) {
//			return n;
//		}
//		return m;

		return n < m ? n : m;
	}

}
