import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		int n = readInt();
		int[] count = new int[10];
		
		while(n > 0) {		
			
			count[n % 10] ++;
			n /= 10;
		}
		
		for(int i=0;i<=9;i++) {
			if(count[i] != 0) {
				println(i + " - " + count[i]);
			}
		}
		
	}
	

}
