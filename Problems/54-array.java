import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		int n = readInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = readInt();
		}

		int maxNum = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {			
			if(arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		

	}

}
