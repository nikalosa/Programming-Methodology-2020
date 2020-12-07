import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		int n = readInt();
		
		int maxNum = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int num = readInt();
			if(num > maxNum) {
				maxNum = num;
			}
		}
		
		println("Max Number: " + maxNum);
		
	}
	

}
