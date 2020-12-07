import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {
		
		int a = readInt("a: ");
		int b = readInt("b: ");
		int c = readInt("c: ");
		
		double revA = (double)1/a;
		double revB = (double)1/b;
		double revC = (double)1/c;
		
		double revSum = revA + revB + revC;
		
		double ans = 1/revSum;
		
		println(ans);
		
	}

}